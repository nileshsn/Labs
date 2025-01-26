#include <stdio.h>
void main()
{ 
 int i,num,sum=0,rem;
 printf("Enter any number = ");
 scanf("%d",&num);
 
 for(i=1;i < num;i++)
 { 
   rem = num%i;
   if(rem==0)
   {
    sum += i;
   }
 }
 if(sum == num)
 {
 printf("Perfect number %d ",num);
 }
 else
 {
 printf("Not a perfect number %d ",num);
 }
}
