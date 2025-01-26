#include<stdio.h>
#include<math.h>

void main()
{
 float p,t,r,si,ci;
 
 printf("ENTER p :");
 scanf("%f",&p);
 
 printf("ENTER t :");
 scanf("%f",&t);
 
 printf("ENTER r :");
 scanf("%f",&r);
 
 si = p * t * r/100;
 ci = p * pow(1+(r/100),t);
 
 printf("SIMPLE INTREST IS : %f\n",si);
 printf("COMPOUND INTREST IS : %f\n",ci);
}
 
 
 
