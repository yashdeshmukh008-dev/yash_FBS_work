#include <stdio.h>
#include <stdlib.h>

void minMax(int arr[], int n)
{
    int min = arr[0], max = arr[0];

    for(int i=1; i<n; i++)
    {
        if(arr[i] < min)
            min = arr[i];

        if(arr[i] > max)
            max = arr[i];
    }

    printf("Minimum = %d\n", min);
    printf("Maximum = %d\n", max);
}

int main()
{
    int n;

    printf("Enter size: ");
    scanf("%d",&n);

    int *arr = (int *)malloc(n*sizeof(int));

    printf("Enter elements:\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    minMax(arr,n);

    free(arr);
    return 0;
}
