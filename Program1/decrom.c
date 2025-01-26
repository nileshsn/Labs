#include <stdio.h>
#include <string.h>

void main()
{
 int num;
 
 printf("Enter a number : ");
 scanf("%d",&num);
 
 printf("Roman numerals :");
 
  while(num != 0)
  {
   if(num >= 50)
   {
    printf("L");
    num = num-50;
   }
   else if(num >= 40)
  {
  printf("XL");
   num = num-40;
   }
   else if(num >= 10)
   {
    printf("X");
    num = num-10;
   }
   else if(num >= 9)
   {
    printf("IX");
    num = num-9;
   }
   else if(num >= 5)
   {
    printf("V");
    num = num-5;
   } 
   else if(num >= 4)
   {
    printf("IV");
    num = num-4;
   }
   else if(num >= 1)
   {
    printf("I");
    num = num-1;
   }
  }  
}

