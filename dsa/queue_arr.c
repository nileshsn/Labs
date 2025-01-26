#include<stdio.h>
#include<stdlib.h>
void enqueue();
void dequeue();
void display();
int queue[100],front=-1,rear=-1,i,x,n,choice;
int main()
{   
    printf("enter the size");
    scanf("%d",&n);
printf("1-enqueue 2-dequeue 3-display 4-exit\n");
while(1)
{
    printf("\nenter the choice: ");
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
        default:printf("invalid");
    }
}
}
void enqueue()
{
    if(rear==n-1)
    {
        printf("queue is overflow");
    }
    else{
        printf("enter the item: ");
        scanf("%d",&x);
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            queue[rear]=x;
        }
        else
        {
            rear=rear+1;
            queue[rear]=x;
        }
    }
        
}
void dequeue()
{
    if(front==-1 && rear==-1)
    {
        printf("queue is empty");
    }
    else if(front==rear)
    {
        front=-1;
        rear=-1;
    }
    else
    {
        printf(" deleted element is %d",queue[front]);
        front=front+1;
    }
}
void display()
{
    if(front==-1)
    {
        printf("queue is empty");
    }
    else
    {
        for(i=front;i<=rear;i++)
        {
            printf("%d",queue[i]);
        
         }
    }

}
