 #include <stdio.h>
#include <stdlib.h>
struct node {
	int data;
	struct node *left, *right;
};
struct node* createnode(int item){
	struct node* new = (struct node*)malloc(sizeof(struct node));
	new->data = item;
	new->left = new->right = NULL;
	return new;
}
struct node* insert(struct node* node, int key){
	if (node == NULL)
		return createnode(key);
	if (key < node->data)
		node->left = insert(node->left, key);
	else if (key > node->data)
		node->right = insert(node->right, key);
	return node;
}
struct node* search(struct node* root, int key){
	if (root == NULL || root->data == key)
		return root;
	if (root->data < key)
		return search(root->right, key);
	return search(root->left, key);   
}
void inorder(struct node *root){
    if(root == NULL)
        return;
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}
int main(){
	int choice,key,ele;

	struct node* root = NULL;
	printf("enter the root element: ");
	scanf("%d",&key);
	root = insert(root, key);
	
	printf("\n1-insert 2-search 3-display 4-exit");
    while(1){
	    printf("\nenter the choice: ");
	    scanf("%d",&choice);
	    switch(choice){
		    case 1:printf("enter the element:");
	           scanf("%d",&ele);
			   insert(root,ele);
			   break;
		    case 2:printf("enter the key to search:");
	           scanf("%d",&key);
			   search(root,key);
			   if (search(root, key) == NULL)
		           printf("%d not found\n", key);
	           else
		           printf("%d found\n", key);
			   break;
		    case 3:inorder(root);
		       break;
		    case 4:exit(0);
		    default:printf("invalid");		   
	    }
    }
}
	
	