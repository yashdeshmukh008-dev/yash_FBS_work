#include <stdio.h>

int main() {
    int n, i, j, isPrime;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers in the array are:\n");

    for(i = 0; i < n; i++) {
        if(arr[i] < 2)
            continue;

        isPrime = 1;

        for(j = 2; j <= arr[i] / 2; j++) {
            if(arr[i] % j == 0) {
                isPrime = 0;
                break;
            }
        }

        if(isPrime)
            printf("%d ", arr[i]);
    }

    return 0;
}
