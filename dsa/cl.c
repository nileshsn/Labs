#include<stdio.h>
#include<stdlib.h>
void insertbeg();
void insertend();
void insertpos();
void deletebeg();
void deletepos();
void deleteend();
void display();
struct node
{
    int data;
    struct node *next;
}*tail,*new,*ptr,*ptr1;
int c=0;
void main()
{ 
    int i,choice,pos;
    printf("*****MENU*****");
    printf("\n1.insertbeg\n2.insertpos\n3.insertend\n4.deletebeg\n5.deletepos\n6.deleteend\n7.display\n8.exit\n");
    while(1)
    {
        printf("\nenter the choice:");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insertbeg();
            break;
            case 2:insertpos();
            break;
            case 3:insertend();
            break;
            case 4:deletebeg();
            break;
            case 5:deletepos();
            break;
            case 6:deleteend();
            break;
            case 7:display();
            break;
            case 8:exit(0);
            default:printf("invalid");

        }
    }
}
void insertbeg()
{
    new=malloc(sizeof(struct node));
    printf("\nenter the data: ");
    scanf("%d",&new->data);
    new->next=NULL;
    if(tail==NULL)
    {
        tail=new;
        tail->next=new;
        c++;
    }
    else
    {
        new->next=tail->next;
        tail->next=new;
        c++;
    }

}
void insertpos()
{
    int i,pos;
    printf("Enter the position:\n");
    scanf("%d",&pos);
    if(pos==1)
    {
        insertbeg();
    }
    else if(pos<=c)
    {
        new=malloc(sizeof(struct node));
        printf("enter the data:");
        scanf("%d",&new->data);
        ptr=tail->next;
        for(i=1;i<pos-1;i++)
        {
            ptr=ptr->next;
        }
        new->next=ptr->next;
        ptr->next=new;
        c++;
    }
    else
    {
        printf("invalid");
    }

}
void insertend()
{
    if(tail==0)
    {
        insertbeg();
    }
    else
    {
        new=malloc(sizeof(struct node));
        printf("enter the data: ");
        scanf("%d",&new->data);
        new->next=tail->next;
        tail->next=new;
        tail=new;
        c++;
    }
}
void display()
{
  if(tail==0)
  {
    printf("\nlist is empty");

  }
  else
  {
    ptr=tail->next;
    while(ptr->next!=tail->next)
    {
        printf("%d",ptr->data);
        ptr=ptr->next;
    }
    printf("%d",ptr->data);
  
}
}
void deletebeg()
{
    ptr=tail->next;
    if(tail==0)
    {
        printf("list is empty");
    }
    else if(ptr->next==ptr)
    {
        tail=0;
        free(ptr);
        c--;
    }
    else
    {
        tail->next=ptr->next;
        free(ptr);
        c--;
    }
}
void deletepos()
{
    int i,pos;
    printf("\nenter the pos: ");
    scanf("%d",&pos);
    if(pos==1)
    {
        deletebeg();
    }
    else if(pos<=c)
    {
        for(i=1;i<pos;i++)
        {
            ptr=ptr->next;
        }
        ptr1=ptr->next;
        ptr->next=ptr1->next;
        printf("%d is deleted",ptr1->data);
        free(ptr1);
        c--;
    }
    else
        printf("Invalid");
}
void deleteend()
{
    ptr=tail->next;
    if(tail==0)
    {
        printf("list is empty");
    }
    else if(ptr->next==ptr)
    {
        tail==0;
        free(ptr);
        c--;
    }
    else
    {
        while(ptr->next!=tail->next)
        {
            ptr1=ptr;
            ptr=ptr->next;
        }
        ptr1->next=ptr->next;
        tail=ptr1;
        free(ptr);
        c--;
    }
}