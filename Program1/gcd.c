#include <stdio.h>
void main()
{ 
 int n1,n2,a,gcd;
 
 printf("ENTER ANY TWO NUMBER :");
 scanf("%d %d",&n1,&n2);
 
 a=n1*n2;
 
 do
 {
 if(n1 > n2)
  n1 = n1 - n2;
  
 if(n2 > n1)
  n2 = n2 - n1;
 }

 while(n1 != n2);
 
 gcd = n1;
 
 printf("\n GCD is = %d",gcd);
}
