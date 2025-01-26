#include <stdio.h>

void main()
{
  int n,i,rem;
  int binary=0,temp=1;
  for(i=0;i<=255;i++)
  {
   n=i;
   while(n!=0)
   {
   rem=n%2;
   binary=binary+(rem*temp);
   temp=temp*10;
   n=n/2;
   }
   printf("Binary Equivalent : %d\n",binary);
   }
   }
   
