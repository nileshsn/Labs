#include <stdio.h>

void main()
{ 
 int i;
 int a=0,b=1,c,n=5;
 for(i=0;i<n;i++)
 {
  if(i<=1)
  {
  c=i;
  }
  else
  {
   c=a+b;
   a=b;
   b=c;
  }
  printf("%d \n",c);
 }
}
