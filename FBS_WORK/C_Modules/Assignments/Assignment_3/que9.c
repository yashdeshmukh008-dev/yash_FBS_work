#include <stdio.h>

void main() {
    int n, temp, rem, reverse = 0;

    n = 121;
    temp = n;

    while (temp != 0) {
        rem = temp % 10;
        reverse = reverse * 10 + rem;
        temp /= 10;
    }

    if (reverse == n)
        printf("Palindrome");
    else
        printf("Not Palindrome");

    
}
