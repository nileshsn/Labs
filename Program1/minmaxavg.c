#include <stdio.h>

void main()
{
 int a[100],i,n,min,max,sum=0,avg;
 
 printf("Enter the array size :");
 scanf("%d",&n);
 
 printf("Enter the array elements :");
 
 for(i=0;i<n;i++)
 {
  scanf("%d",&a[i]);
  sum=sum+a[i];
 }
 
 avg=sum/n;
 printf("avg : %d\n",avg);
 
 min = a[0];
 max = a[0];
 for(i=0;i<n;i++)
 {
  if(min > a[i])
     min = a[i];
  if(max < a[i])
     max = a[i];
 }
 printf("Minimum array is : %d",min);
 printf("\nMaximum array is : %d",max);
}
