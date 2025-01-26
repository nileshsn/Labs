#include <stdio.h>

void main()
{
  int n,firstdigit,lastdigit;
  
  printf("Enter any Number = ");
  scanf("%d",&n);
  
  lastdigit = n % 10;
  
  while(n >= 10)
  { 
   n = n/10;
  }
  firstdigit = n;
  
  printf("First digit  = %d and last digit = %d \n \n",firstdigit,lastdigit);
}
