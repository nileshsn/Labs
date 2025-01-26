#include <stdio.h>
#include <math.h>
void main()
{ 
 int a,b,c,d;
 
 printf("ENTER a VALUE : ");
 scanf("%d",&a);
 
 printf("ENTER b VALUE : ");
 scanf("%d",&b);

 printf("ENTER c VALUE : ");
 scanf("%d",&c);
 d=sqrt(b*b-4*a*c);
 
 int r1 = (-b+d)/(2*a);
 int r2 = (-b-d)/(2*a);
 
 printf("SQUARE ROOT IS : %d \n %d",r1,r2);
}
