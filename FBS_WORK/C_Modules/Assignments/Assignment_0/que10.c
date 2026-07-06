#include <stdio.h>

void main() {
    int sub1 = 80, sub2 = 75, sub3 = 90, sub4 = 85, sub5 = 70;
    int total;
    float percentage;

    total = sub1 + sub2 + sub3 + sub4 + sub5;
    percentage = total / 5.0;

    printf("Marks:\n");
    printf("Subject 1 = %d\n", sub1);
    printf("Subject 2 = %d\n", sub2);
    printf("Subject 3 = %d\n", sub3);
    printf("Subject 4 = %d\n", sub4);
    printf("Subject 5 = %d\n", sub5);

    printf("\nTotal Marks = %d\n", total);
    printf("Percentage = %.2f%%\n", percentage);

   
}
