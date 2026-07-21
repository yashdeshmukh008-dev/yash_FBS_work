#include <stdio.h>

int main() {
    int n, i;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n], brr[n], crr[n];

    printf("Enter elements of first array:\n");
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter elements of second array:\n");
    for(i = 0; i < n; i++) {
        scanf("%d", &brr[i]);
    }

    
    for(i = 0; i < n; i++) {
        crr[i] = arr[i] + brr[i];
    }

    printf("Sum of two arrays :\n");
    for(i = 0; i < n; i++) {
        printf("%d ", crr[i]);
    }

    return 0;
}
