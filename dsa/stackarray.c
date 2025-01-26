#include<stdio.h>
#include<stdlib.h>
void push();
void pop();
void display();
int top=-1,i,j,n,item,choice;
int stack[100];
void main()
{
    printf("enter the size: ");
    scanf("%d",&n);
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
    if(top==n-1)
    {
        printf("stack is overflow\n");
    }
    else
    {
        printf("enter the element: ");
        scanf("%d",&i);
        //top=top+1;
        ++top;
        stack[top]=i;
    }
}
void pop()
{
    if(top==-1)
    {
        printf("stack is underflow\n");
    }
    else
    {
        printf("item is deletd from the stack %d",stack[top]);
        top--;
    }
}
void display()
{
  
    if(top==-1)
    {
        printf("stack is empty\n");
    }
    else
    {
        for(j=top;j>=0;j--)
        {
            printf("%d ",stack[j]);
        }
    }

}
