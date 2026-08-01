#include <stdio.h>
#include <stdlib.h>

void primeArray(int arr[], int n)
{
    int i,j,flag;

    for(i=0;i<n;i++)
    {
        if(arr[i]<2)
            continue;

        flag=1;

        for(j=2;j<=arr[i]/2;j++)
        {
            if(arr[i]%j==0)
            {
                flag=0;
                break;
            }
        }

        if(flag)
            printf("%d ",arr[i]);
    }
}

int main()
{
    int n;

    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    primeArray(arr,n);

    free(arr);
}
