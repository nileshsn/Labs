#include <stdio.h>
void quickSort(int a[], int low, int high){
    int i,j,pivot,t;
    if (low <= high){
         i=low;
         j=high;
        pivot=low;
        
        while(i<j){
             while(a[i]<=a[pivot]){
                 i++;
             }
             while(a[j]>a[pivot]){
                 j--;
             }
             if(i<j){
                 t=a[i];
                 a[i]=a[j];
                 a[j]=t;
             }
             else{
                 t=a[j];
                 a[j]=a[pivot];
                 a[pivot]=t;
             }
            quickSort(a,low, j-1);
            quickSort(a, j+1,high);
        }
}
}
int main()
{
    int n, i;
    printf("enter array size : ");
    scanf("%d", &n);
    int a[n];
    printf("enter array : \n");
    for (i = 0; i < n; i++)
    {
         scanf("%d",&a[i]);
    }

    quickSort(a,0,n - 1);

    printf("Sorted array: \n");
    
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
         printf("\n");
    }
    return 0;
    }
