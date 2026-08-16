#include <stdio.h>

void findOddEven(int arr[], int n)
{
    int i;

    printf("Even numbers: ");
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 0)
            printf("%d ", arr[i]);
    }

    printf("\nOdd numbers: ");
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 != 0)
            printf("%d ", arr[i]);
    }
}

int main()
{
    int arr[100], n, i;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    findOddEven(arr, n);

    return 0;
}
