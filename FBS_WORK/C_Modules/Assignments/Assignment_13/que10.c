#include <stdio.h>
#include <stdlib.h>

void sort(int arr[],int n)
{
    int temp;

    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}

int main()
{
    int n;

    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    sort(arr,n);

    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);

    free(arr);
}
