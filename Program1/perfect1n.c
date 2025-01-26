#include <stdio.h>
void main()
{ 
 int n,min,max,i,j,sum;
 printf("Enter any number = ");
 scanf("%d",&n);
 
 for(i=min;i <= max;i++)
 { 
   n=i;
   sum=0;
   for(j=1;j<=n/2;j++)
   
   {
    if(n%j==0)
    sum=sum+j;
   }
   
    if(n==sum)
    printf("Sum = %d\n ",sum);
  }
}
