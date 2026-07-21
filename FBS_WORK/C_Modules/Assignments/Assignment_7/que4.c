#include <stdio.h>

int main() {
    int n = 6;
    int arr[] = {10, 15, 22, 37, 40, 51};
    

    printf("Even numbers: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0)
            printf("%d ", arr[i]);
    }

    printf("\nOdd numbers: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 != 0)
            printf("%d ", arr[i]);
    }

    return 0;
}
