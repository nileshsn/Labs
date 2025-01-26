#include <stdio.h>
#include <string.h>

void main()
{
 char roman[30];
 int d[30],l,i,dec=0;
 
 printf("Enter the roman number \n");
 scanf("%s",roman);
 
 l=strlen(roman);
 for(i=0;i<l;i++)
 { 
  switch(roman[i])
  {
   case 'I' : d[i] = 1;
   break;
   case 'V' : d[i] = 5;
   break;
   case 'X' : d[i] = 10;
   break;
   case 'L' : d[i] = 50;
   break;
   default : printf("Invalid Roman number");
   break;
  }
  }
  for(i=0;i<l;i++)
  {
  if(i==l-1 || d[i]>=d[i+1])
  dec = dec+d[i];
  
  else
  dec = dec-d[i];
  }
   
  }
 printf("Decimal equivalent of Roman numeral %s is %d",roman,dec);
}

