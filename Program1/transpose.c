#include <stdio.h>

void main()
{
 int r,c,i,j;
 printf("Enter row and coloum size \n");
 scanf("%d %d",&r,&c);
 
 int a[r][c];
 printf("Matrix Elements are \n");
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
  {
   scanf("%d",&a[i][j]);
  }
 }
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
  {
   printf("\t %d",a[j][i]);
  }
  printf("\n");
 }
}
