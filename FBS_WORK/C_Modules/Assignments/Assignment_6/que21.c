#include <stdio.h>


 void Armstrong(int n) {
    
    int num, temp, rem, digits, sum;

    printf("Armstrong numbers between 1 and %d are:\n", n);

    for (num = 1; num <= n; num++) {
        temp = num;
        digits = 0;
        sum = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            sum += pow(rem, digits);
            temp /= 10;
        }
        if (sum == num)
            printf("%d ", num);
    }

    
}
void main(){
  int n = 1000; 
  Armstrong(n);
}
