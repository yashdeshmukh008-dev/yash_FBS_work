#include <stdio.h>

void search(int arr[], int n, int num)
{
    int i, found = 0;

    for(i = 0; i < n; i++)
    {
        if(arr[i] == num)
        {
            printf("Number found at position %d\n", i + 1);
            found = 1;
            break;
        }
    }

    if(found == 0)
        printf("Number not found\n");
}

int main()
{
    int arr[100], n, num, i;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Enter number to search: ");
    scanf("%d", &num);

    search(arr, n, num);

    return 0;
}
