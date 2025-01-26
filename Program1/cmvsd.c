#include <stdio.h>
#include <math.h>

void main()
{
 int i,n;
 float standarddeviation,sum=0,sumsqr=0,mean,value,variance=0,a[100];
 
 printf("Enter the value of n :");
 scanf("%d",&n);
 
 printf("\nEnter the numbers :");
 for(i=0;i<n;i++)
 {
  printf("\n Number %d : ",i+1);
  scanf("%f",&a[i]);
  sum=sum+a[i];
 }
 mean=(float)sum/n;
 sumsqr=0;
 for(i=0;i<n;i++)
 {
  value=a[i]-mean;
  sumsqr=sumsqr+value*value;
 }
 variance=sumsqr/n;
 standarddeviation=sqrt(variance);
 
 printf("\n Mean of %d numbers : %f\n",n,mean);
 printf("\n Variance of %d numbers : %f\n",n,variance);
 printf("\n Standard deviation of %d numbers : %f\n",n,standarddeviation);
}
