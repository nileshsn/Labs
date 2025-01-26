#include<stdio.h>
#include<ctype.h>
#define size 100
int stack[size];
int top=-1;
void push();
int pop();
int evaluate_postfix(char po_exp[])
{
    int a,b,result,i;
 for(i=0;po_exp[i]!='\0';i++)
 {
        if(isdigit(po_exp[i]))
        push(po_exp[i]-'0');

    
     else
     {
        a=pop();
        b=pop();
        switch(po_exp[i])
        {
            case'+':result=b+a;
            break;
            case'-':result=b-a;
            break;
            case'*':result=b*a;
            break;
            case'/':result=b/a;
            break;
        }
        push(result);
     }

  }
   return pop();
}
void push(int element)
{
    if(top>=size-1)
    {
        printf("stack overflow\n");
        return;
    }
    stack[++top]=element;
}
int pop()
{
    if(top<0)
    {
        printf("stack underflow\n");
        return 0;
    }
    return stack[top--];
}
int main()
{
    char po_exp[size];
    int res;
    printf("enter postfix expression:\n");
    scanf("%s",po_exp);
    res=evaluate_postfix(po_exp);
    printf("result:%d\t\n",res);
    return 0;
}
