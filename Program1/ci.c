#include<stdio.h>
#include<math.h>

void main()
{
 float p,t,r,ci;
 
 printf("ENTER p :");
 scanf("%f",&p);
 
 printf("ENTER t :");
 scanf("%f",&t);
 
 printf("ENTER r :");
 scanf("%f",&r);
 
 ci = p * pow(1+(r/100),t);
 
 printf("COMPOUND INTREST IS : %f",ci);
}
 
 
 
