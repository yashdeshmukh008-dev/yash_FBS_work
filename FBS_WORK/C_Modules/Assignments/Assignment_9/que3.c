#include <stdio.h>

int findSum(int arr[], int n)
{
    int sum = 0, i;

    for(i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }

    return sum;
}

int main()
{
    int arr[100], n, i, sum;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    sum = findSum(arr, n);

    printf("Sum = %d\n", sum);

    return 0;
}
