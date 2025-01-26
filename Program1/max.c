#include <stdio.h>
void main()
{ 
 int a,b,c;
 
 printf("Enter a number a:");
 scanf("%d",&a);
 
 printf("Enter a number b:");
 scanf("%d",&b);
 
 printf("Enter a number c:");
 scanf("%d",&c);
 
 if(a > b && a > c)
 {
  printf("a is max\n");
 }
 else if(b > c && b > a)
 {
  printf("b is max\n");
 }
 else if(c > a && c > b)
 {
  printf("c is max\n");
 }
 else
 {
  printf("3 are equal\n");
 }
}
