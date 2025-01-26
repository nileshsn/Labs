#include<stdio.h>
#include<stdlib.h>
int choice,i,pos,item;
void insertion();
void deletion();
void traverse();

struct node
{
    int data;
    struct node *next;
}*new,*head,*ptr1,*ptr;

void main()
{
    printf("***menu***");
    printf("\n1.insertion\n2.deletion\n3.traverse\n4.exit\n");
    
    while(1)
    {
        
        printf("\nenter main menu chioce: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insertion();
            break;
            case 2:deletion();
            break;
            case 3:traverse();
    
            break;
            case 4:exit(0);
            default:
            printf("\nwrong choice");

        }
    }

}
void insertion()
{
    new=malloc(sizeof(struct node));
    printf("\nenter the item to be inserted: ");
    scanf("%d",&new->data);
    if(head==NULL)
    {
        new->next=NULL;
        head=new;
    }
    else{
        printf("\nenter the place to insert the item: ");
        printf("1.start\n2.middle\n3.end\n");
        scanf("%d",&choice);
        if(choice==1)
        {
            new->next=head;
            head=new;
        }
        if(choice==2)
        {
            ptr=head;
            printf("\nenter the pos to place an item: ");
            scanf("%d",&pos);
            for(i=1;i<pos-1;i++)
            {
                ptr=ptr->next;
            }
                new->next=ptr->next;
                ptr->next=new;
            
        }
        if(choice==3)
        {
            ptr=head;
            while(ptr->next!=NULL)
                ptr=ptr->next;
                new->next=NULL;
                ptr->next=new;
        }
    }
}
void deletion()
{
    ptr=head;
    if(head==NULL)
    {
        printf("list is empty");
    }
    else
    {
        printf("\n1.start\n2.atpos\n3.end");
        printf("\nenter delete element:\n");
        scanf("%d",&choice);
        if(choice==1)
        {
            printf("deleted element from list is :%d",ptr->data);
            head=head->next;
        }
        if(choice==2)
        {
            printf("enter the pos to delete:\n");
            scanf("%d",&pos);
            for(i=1;i<pos-1;i++)
            {
                ptr=ptr->next;
            }
            ptr1=ptr->next;
            ptr->next=ptr1->next;

            printf("\nthe deleted element is %d",ptr1->data);
            free(ptr1);
           // ptr->next=temp->next;
        }
        if(choice==3)
        {
            while(ptr->next!=NULL)
            {
                ptr1=ptr;
                ptr=ptr->next;
            }
            printf("\nthe deleted element is %d",ptr->data);
            ptr1->next=NULL;
            free(ptr);
        }


    }
}
void traverse()
{
    if(head==NULL)
    {
        printf("list is empty");
    }
    else
    {
        printf("\nlist is : \n");
        for(ptr=head;ptr!=NULL;ptr=ptr->next)
        {
            printf("%d",ptr->data);
        }

    }
}
