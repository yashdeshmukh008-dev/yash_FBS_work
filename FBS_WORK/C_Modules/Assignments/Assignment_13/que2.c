#include <stdio.h>
#include <stdlib.h>

void search(int arr[], int n, int key)
{
    for(int i=0;i<n;i++)
    {
        if(arr[i]==key)
        {
            printf("Element found at position %d",i+1);
            return;
        }
    }

    printf("Element not found");
}

int main()
{
    int n,key;

    printf("Enter size: ");
    scanf("%d",&n);

    int *arr=(int *)malloc(n*sizeof(int));

    printf("Enter elements:\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    printf("Enter number to search: ");
    scanf("%d",&key);

    search(arr,n,key);

    free(arr);
    return 0;
}
