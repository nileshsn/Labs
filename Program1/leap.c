#include <stdio.h>
void main()
{ 
 int num;
 
 printf("ENTER ANY NUMBER :");
 scanf("%d",&num);
 
 if(num % 4 == 0)
 {
  printf("LEAP YEAR");
 }
 else
 {
  printf("NOT A LEAP YEAR");
 }
}
 
