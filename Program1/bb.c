#include <stdio.h>
#include <math.h>
void main()
{
 int x,n,a,i,sum=0;
 printf("Enter x value : ");
 scanf("%d",&x);
 printf("Enter n value :");
 scanf("%d",&n);
 for(i=0;i<=n;i++)
 {
 a=pow(x,i);
 sum=sum+a;
 }
 printf("%d \n %d",a,sum);
 }
