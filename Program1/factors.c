#include <stdio.h>
void main()
{ 
 int n,i,j,count=0;
 
 printf("Enter n :");
 scanf("%d",&n);

 for(i=1;i<=n;i++)
 {
   if(n%i==0)
   {
    count=0;
    }
    for(j=1;j<=i;j++)
    { 
     if(i%j==0)
     {
     count++;
     }
   }
   if(count==2)
   {
   printf("%d \n",i);
   }
   }
 }

