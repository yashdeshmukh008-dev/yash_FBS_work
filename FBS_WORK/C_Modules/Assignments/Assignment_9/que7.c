#include <stdio.h>

void addArray(int arr[], int brr[], int crr[], int n)
{
    int i;

    for(i = 0; i < n; i++)
    {
        crr[i] = arr[i] + brr[i];
    }
}

void display(int arr[], int n)
{
    int i;

    for(i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

int main()
{
    int arr[100], brr[100], crr[100];
    int n, i;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter first array:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Enter second array:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &brr[i]);

    addArray(arr, brr, crr, n);

    printf("Third array: ");
    display(crr, n);

    return 0;
}
