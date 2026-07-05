#include <stdio.h>

void main() {
    int n = 1000;   
    int i, j, sum;

    printf("Perfect numbers between 1 and %d are:\n", n);

    for (i = 1; i <= n; i++) {
        sum = 0;

       
        for (j = 1; j <= i / 2; j++) {
            if (i % j == 0)
                sum += j;
        }

        if (sum == i)
            printf("%d ", i);
    }

   
}
