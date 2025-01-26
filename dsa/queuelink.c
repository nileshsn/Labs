#include<stdio.h>
#include<stdlib.h>
void enqueue();
void dequeue();
void display();
struct node
{
    int data;
    struct node *next;
}*front=NULL,*rear=NULL,*new,*temp;
void main()
{
    int choice;
    printf("\n1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\n");

    while(1)
    {
        printf("\nenter the choice:");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:enqueue();
            break;
            case 2:dequeue();
            break;
            case 3:display();
            break;
            case 4:exit(0);
            default:printf("INVALID");
        }

    }
}
void enqueue()
{
    new=malloc(sizeof(struct node));
    printf("enter the data: ");
    scanf("%d",&new->data);
    if(front==NULL && rear==NULL)
    {
        front=rear=new;
      
    }
    else
    {
        rear->next=new;
        rear=new;
    }
}
void dequeue()
{
    temp=front;
    if(front==NULL && rear==NULL)
    {
        printf("queue is empty\n");
    }
    else if (front==rear)
    {
        rear=front=NULL;
    }
    else
    {
        front=front->next;
        printf("%d is dequeue",temp->data);
        free(temp);
    }
}
void display()
{
    temp=front;
    if(front==NULL && rear==NULL)
    {
        printf("queue is empty\n");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d",temp->data);
            temp=temp->next;
        }

    }
}