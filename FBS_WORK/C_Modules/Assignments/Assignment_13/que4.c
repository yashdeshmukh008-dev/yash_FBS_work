#include <stdio.h>
#include <stdlib.h>

void evenOdd(int arr[], int n)
{
    printf("Even Numbers: ");

    for(int i=0;i<n;i++)
        if(arr[i]%2==0)
            printf("%d ",arr[i]);

    printf("\nOdd Numbers: ");

    for(int i=0;i<n;i++)
        if(arr[i]%2!=0)
            printf("%d ",arr[i]);
}

int main()
{
    int n;

    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    evenOdd(arr,n);

    free(arr);
}
