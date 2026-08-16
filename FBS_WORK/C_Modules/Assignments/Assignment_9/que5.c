#include <stdio.h>

void printAlternate(int arr[], int n)
{
    int i;

    printf("Alternate elements: ");

    for(i = 0; i < n; i = i + 2)
    {
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

    printAlternate(arr, n);

    return 0;
}
