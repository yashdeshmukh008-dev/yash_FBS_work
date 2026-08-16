#include <stdio.h>

void mergeArray(int arr[], int brr[], int crr[], int n1, int n2)
{
    int i;

    for(i = 0; i < n1; i++)
    {
        crr[i] = arr[i];
    }

    for(i = 0; i < n2; i++)
    {
        crr[n1 + i] = brr[i];
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
    int arr[100], brr[100], crr[200];
    int n1, n2, i;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    printf("Enter first array:\n");
    for(i = 0; i < n1; i++)
        scanf("%d", &arr[i]);

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    printf("Enter second array:\n");
    for(i = 0; i < n2; i++)
        scanf("%d", &brr[i]);

    mergeArray(arr, brr, crr, n1, n2);

    printf("Merged array: ");
    display(crr, n1 + n2);

    return 0;
}
