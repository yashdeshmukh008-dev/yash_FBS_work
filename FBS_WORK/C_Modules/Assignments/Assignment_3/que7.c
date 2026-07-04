#include <stdio.h>

void main() {
    int n;
    long long factorial = 1;

   n = 5;

    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }

    printf("%lld", factorial);

}
