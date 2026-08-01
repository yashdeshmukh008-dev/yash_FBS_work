#include <stdio.h>
#include <stdlib.h>

void reverse(int arr[],int n)
{
    int temp;

    for(int i=0;i<n/2;i++)
    {
        temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
    }
}

int main()
{
    int n;

    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    reverse(arr,n);

    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);

    free(arr);
}
