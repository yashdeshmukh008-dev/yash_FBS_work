#include <stdio.h>

int main() {
    int n1, n2, i;

    printf("Enter the size of first array: ");
    scanf("%d", &n1);

    int arr[n1];

    printf("Enter the elements of first array:\n");
    for(i = 0; i < n1; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the size of second array: ");
    scanf("%d", &n2);

    int brr[n2];

    printf("Enter the elements of second array:\n");
    for(i = 0; i < n2; i++) {
        scanf("%d", &brr[i]);
    }

    int crr[n1 + n2];

   
    for(i = 0; i < n1; i++) {
        crr[i] = arr[i];
    }

    
    for(i = 0; i < n2; i++) {
        crr[n1 + i] = brr[i];
    }

    printf("Merged array:\n");
    for(i = 0; i < n1 + n2; i++) {
        printf("%d ", crr[i]);
    }

    return 0;
}
