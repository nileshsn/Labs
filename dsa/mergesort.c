#include<stdio.h>
void merge();
void mergesort(int a[],int low,int high)
{
if(low<high)
{
    int mid=(low+high)/2;
    mergesort(a,low,mid);
    mergesort(a,mid+1,high);
    merge(a,low,mid,high);
}
}

void merge(int a[],int low,int mid,int high)
{
    int i=low;
    int j=mid+1;
    int b[10];
    int k=low;
	while(i<=mid && j<=high)     
	{
	    if(a[i]<=a[j])
	    {
		    b[k++]=a[i++];
        }
	    else
        {
	        b[k++]=a[j++];
        }
	}
	while(i<=mid)
	{
	    b[k++]=a[i++];
	}
	while(j<=high)
	{
	    b[k++]=a[j++];
	}
	for(k=low;k<=high;k++)
	{
	    a[k]=b[k];
	}

}
void main()
{
    int n, i;
    printf("enter array size : ");
    scanf("%d", &n);
    int a[n];
    printf("enter array elements: \n");
    for (i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }

    mergesort(a,0,n-1);
    printf("Sorted array: \n");
    for (i=0; i<n; i++)
    {
        printf("%d ",a[i]);
    }
    
}
