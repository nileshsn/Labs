#include <stdio.h>
void main()
{
 int n,r,sum=0,c;
 
 printf("Enter any number =");
 scanf("%d",&n);

 c=n;
 while (n>0)
 {
  r=n%10;
  sum=(sum*10)+r;
  n=n/10;
 }
 if(c==sum)
 printf("PALINDROME");
 else
 printf("NOT A PALINDROME");
}
