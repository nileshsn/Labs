#include <stdio.h>
#include <math.h>
void main()
{
 int range,num,digit,sum,rem,i;
 
 printf("Enter range = ");
 scanf("%d",&range);
 {
  num=i;
  digit=0;
  sum=0;
  while(num!=0)
  {
   digit++;
   num=num/10;
  }
  num=i;
  while(num!=0)
  {
   rem=num%10;
   sum=sum+pow(rem,digit);
   num=num/10;
  }
  if(sum==1)
  {
   printf("%d\n",i);
  }
 }
}
