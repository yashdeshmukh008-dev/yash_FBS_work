#include <stdio.h>

void main() {
    int a = 10, b = 20, temp;

    printf("Before Swapping:\n");
    printf("a = %d\n", a);
    printf("b = %d\n", b);

    temp = a;
    a = b;
    b = temp;

    printf("\nAfter Swapping:\n");
    printf("a = %d\n", a);
    printf("b = %d\n", b);

}
