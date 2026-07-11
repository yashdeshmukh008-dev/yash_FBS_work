#include <stdio.h>
#include <math.h>

void armstrong(int num) {
    int originalNum, remainder, digits = 0;
    int result = 0;
    num = 153;
    originalNum = num;
    while (originalNum != 0) {
        originalNum /= 10;
        digits++;
    }
    originalNum = num;
    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += pow(remainder, digits);
        originalNum /= 10;
    }
    if (result == num)
        printf("%d is an Armstrong number.", num);
    else
        printf("%d is not an Armstrong number.", num);
}
void main(){
  int num = 121;
  armstrong(num);
}
