#include <stdio.h>

void main() {
    int n, first, last;

   n = 12345;
    last = n % 10;

    first = n;
    while (first >= 10) {
        first /= 10;
    }

    printf("%d", first + last);

    
}
