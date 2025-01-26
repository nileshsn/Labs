#include <stdio.h>

void main()
{
  int num;
  int count = 0;
  
  printf("Enter any Number = ");
  scanf("%d",&num);
  
  num > 0;
  do
  { 
   count++;
   num /= 10;
  }
  while(num != 0);
  
  printf("Digits count = %d",count);
}
