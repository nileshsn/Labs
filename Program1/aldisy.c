#include <stdio.h>
void main()
{ 
 char ch;
 
 printf("ENTER ANY CHARACTER :");
 scanf("%c",&ch);
 
 if(ch >= 'A' && ch <= 'Z')
 {
  printf("ALPHABET");
 }
 else if(ch >= '0' && ch <= '9')
 {
  printf("DIGIT");
 }
 else
 {
  printf("SPECIAL SYMBOL");
 }
}
 
