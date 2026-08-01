#include <stdio.h>
#include <stdlib.h>

int sumArray(int arr[], int n)
{
    int sum=0;

    for(int i=0;i<n;i++)
        sum+=arr[i];

    return sum;
}

int main()
{
    int n;

    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    printf("Sum = %d",sumArray(arr,n));

    free(arr);
    return 0;
}
