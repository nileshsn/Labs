#include <stdio.h>
void main()
{ 
 int num,i;
 
 printf("Enter any number :");
 scanf("%d",&num);
  i=2;
  while(i<=num)
  {
   if(num % i ==0)
      break;
   else
       i++;
  }
  if(num == i)
    printf("Prime number");
  else
    printf("Not a Prime Number");
}
