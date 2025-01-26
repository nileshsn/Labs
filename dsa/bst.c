#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* left;
    struct node* right;
};
struct node* create(int data){
    struct node *new;
    new=(struct node*)malloc(sizeof(struct node));
    new->data=data;
    new->left=NULL;
    new->right=NULL;
    return new;
}
struct node* insert(struct node* root, int data){
    if(root==NULL){
        return create(data);
    }
    if(data<root->data){
        root->left=insert(root->left, data);
    } 
    else if(data>root->data){
        root->right=insert(root->right, data);
    }
    return root;
}
struct node* search(struct node* root, int data){
    if(root==NULL||root->data==data)
       return root;
    else if(root->data>data)
       search(root->left,data);
    else
       search(root->right,data);
}
void inOrderTraversal(struct node* root){
    if(root!=NULL) {
        inOrderTraversal(root->left);
        printf("%d ", root->data);
        inOrderTraversal(root->right);
    }
}
int main(){
    struct node* root=NULL;
    int num, searchdata;

    printf("Enter elements to insert into the BST (enter -1 to stop):\n");
    while(1){
        scanf("%d", &num);
        if(num==-1)
            break;
        root=insert(root, num);
    }
    printf("In-order traversal: ");
    inOrderTraversal(root);

    printf("\nEnter a value to search in the BST: ");
    scanf("%d", &searchdata);
    struct node* result = search(root, searchdata);
    if (result!= NULL) 
        printf("%d found in the BST.\n", searchdata);
    else
        printf("%d not found in the BST.\n", searchdata);
    return 0;
}


/*struct node* findMin(struct node* root) {
    if (root==NULL){
        return NULL;
    }
    while (root->left!=NULL){
        root=root->left;
    }
    return root;*/