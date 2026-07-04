#include <stdio.h>

void main() {
    int n, temp, rem, sum = 0;

    n = 145;

    temp = n;

    while (temp != 0) {
        rem = temp % 10;

        int fact = 1;
        for (int i = 1; i <= rem; i++) {
            fact *= i;
        }

        sum += fact;
        temp /= 10;
    }

    if (sum == n)
        printf("Strong");
    else
        printf("Not Strong");

   
}
