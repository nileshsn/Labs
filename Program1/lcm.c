#include <stdio.h>
void main()
{ 
 int n1,n2,a,lcm;
 
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
 
 lcm = a/n1;
 
 printf("\n LCM is = %d",lcm);
}
