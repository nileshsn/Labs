#include <stdio.h>

void main()
{
 int a,b;
 char ch;

 printf("ENTER OPERATOR = ");
 scanf("%c",&ch);

   printf("ENTER THE VALUES of a,b =");
 scanf("%d %d",&a,&b);
 switch(ch)
 {
  case '+' : printf("SUM IS : %d\n",a+b);
  break;
  
  
  case '-' : printf("DIFFERENCE IS : %d\n",a-b);
 break;
  
  case '*' : printf("MULTIPLICATION IS : %d\n",a*b);
  break;
  
  case '/' : printf("DIVISION IS : %d\n",a/b);
 break; 
  
  case '%' : printf("MODULUS IS : %d\n",a%b);
  break;
  
  default : printf("INVALID");
 }
}
