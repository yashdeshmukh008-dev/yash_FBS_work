#include <stdio.h>

void main() {
    int n = 1000;   
    int num, temp, rem, sum, fact, i;

    printf("Strong numbers between 1 and %d are:\n", n);

    for (num = 1; num <= n; num++) {
        temp = num;
        sum = 0;

        while (temp != 0) {
            rem = temp % 10;

            
            fact = 1;
            for (i = 1; i <= rem; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num)
            printf("%d ", num);
    }

   
}
