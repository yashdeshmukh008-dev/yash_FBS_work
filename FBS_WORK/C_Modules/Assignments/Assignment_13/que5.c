#include <stdio.h>
#include <stdlib.h>

void alternate(int arr[], int n)
{
    for(int i=0;i<n;i+=2)
        printf("%d ",arr[i]);
}

int main()
{
    int n;

    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    alternate(arr,n);

    free(arr);
}
