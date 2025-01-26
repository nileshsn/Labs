#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
#define size 100
int precedence(char operator)
{
    switch (operator)
    {
        case'+':
        case'-':
            return 1;
        case'*':
        case'/':
            return 2;
        case'^':
            return 3;
        default:
            return -1;
    }
}
char* infixtopostfix(char* infix)
{
    int i,j;
    int len=strlen(infix);
    char* postfix=(char *)malloc(sizeof(char));
    char stack[size];
    int top=-1;
    for(i=0,j=0;i<len;i++)
    {
        if(infix[i]==' '||infix[i]=='\t')
            continue;
        if(isalnum(infix[i]))
        {
            postfix[j++]=infix[i];
        }
        else if(infix[i]=='(')
        {
            stack[++top]=infix[i];
        }
        else if(infix[i]==')')
        {
            while(top>-1&&stack[top]!='(')
            {
                postfix[j++]=stack[top--];
            }
                top--;
            
        }
        else
        {
            while(top >-1 && precedence(stack[top])>=precedence(infix[i]))
            {
                postfix[j++]=stack[top--];
            }
            stack[++top]=infix[i];
        }
    }
    while(top >-1)
    {
        if(stack[top]=='(')
        {
            printf("invalid expression");
        }
        postfix[j++]=stack[top--];
    }
    postfix[j]='\0';
    return postfix;
}
int main()
{
    char infix[size];
    printf("enter the evalution:\n");
    scanf("%s",infix);
   // char infix[size]="1*2+(5*6^9)-(8+11)";
    char* postfix=infixtopostfix(infix);
    printf("%s\n",postfix);
    free(postfix);
    return 0;
}
