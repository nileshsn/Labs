#include<stdio.h>
#include<stdlib.h>
void push();
void pop();
void display();
struct node
{
    int data;
    struct node *next;
}*top,*new,*temp;
void main()
{
    int choice;
    printf("\n1.push\n2.pop\n3.display\n4.exit\n");
    while(1)
    {
        printf("\nenter the choice:");
        scanf("%d",&choice);

    
    switch(choice)
    {
        case 1:push();
            break;
        case 2:pop();
            break;
        case 3:display();
            break;
        case 4:exit(0);
        default:printf("INVALID\n");
    }
    }
}
void push()
{
    new=malloc(sizeof(struct node));
    printf("enter the data:");
    scanf("%d",&new->data);
    new->next=top;
    top=new;
}
void pop()
{
    if(top==NULL)
    {
        printf("stack is empty\n");
    }
    else
    {
        temp=top;
        printf("%d item is dlt from stack",temp->data);
        top=top->next;
        free(temp);

    }
}
void display()
{
    if(top==NULL)
    {
        printf("stack is empty");
    }
    else
    {
        temp=top;
        while(temp!=NULL)
        {
            printf("%d   ",temp->data);
            temp=temp->next;
        }
       
    }
}
