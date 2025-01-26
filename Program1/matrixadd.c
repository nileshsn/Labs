#include<stdio.h>
int main()
{
	int r1,c1,r2,c2,i,j,c[10][10];
	printf("enter row and col size of 1st matrix");
	scanf("%d%d",&r1,&c1);
	printf("enter row and col size of 2nd matrix");
	scanf("%d%d",&r2,&c2);
	int a[r1][c1],b[r2][c2];
	if(r1==r2&&c1==c2)
	{
	printf("enter the elements of first matrix");
	
	for(i=0;i<r1;i++)
	{
	for(j=0;j<c1;j++)	
	{
		scanf("%d",&a[i][j]);
	}
	}
		printf("enter the elements of 2nd matrix");
	
	for(i=0;i<r2;i++)
	{
	for(j=0;j<c2;j++)	
	{
		scanf("%d",&b[i][j]);
	}
	}
	

	for(i=0;i<r1;i++)
	{
	for(j=0;j<c1;j++)	
	{
		c[i][j]=a[i][j]-b[i][j];
	}
	
	}
		printf("addition of matrices");
			for(i=0;i<r1;i++)
	{
	for(j=0;j<c1;j++)	
	{
		printf("%d ",c[i][j]);
	}
	printf("\n");
	
	}
}
else
printf("addition will not be performed");
}
