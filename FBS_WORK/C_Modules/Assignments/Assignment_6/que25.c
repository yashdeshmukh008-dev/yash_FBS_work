#include <stdio.h>

void choices(int b) {
    
    int choice;

    printf("Number = %d\n\n", num);

    printf("MENU:\n");
    printf("1. Even or Odd\n");
    printf("2. Prime or Not\n");
    printf("3. Palindrome or Not\n");
    printf("4. Positive, Negative or Zero\n");
    printf("5. Reverse Number\n");
    printf("6. Sum of Digits\n\n");

    choice = 3;  

    printf("Selected Option: %d\n\n", choice);

    if (choice == 1) {
        if (num % 2 == 0)
            printf("Even Number\n");
        else
            printf("Odd Number\n");
    }

    else if (choice == 2) {
        int i, flag = 0;
        if (num <= 1) flag = 1;

        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            printf("Prime Number\n");
        else
            printf("Not a Prime Number\n");
    }

    else if (choice == 3) {
        int temp = num, rev = 0, rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if (rev == num)
            printf("Palindrome Number\n");
        else
            printf("Not a Palindrome Number\n");
    }

    else if (choice == 4) {
        if (num > 0)
            printf("Positive Number\n");
        else if (num < 0)
            printf("Negative Number\n");
        else
            printf("Zero\n");
    }

    else if (choice == 5) {
        int temp = num, rev = 0, rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        printf("Reversed Number = %d\n", rev);
    }

    else if (choice == 6) {
        int temp = num, sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        printf("Sum of Digits = %d\n", sum);
    }

    else {
        printf("Invalid Choice\n");
    }

    
}
void main(){
   int num = 121; 
  choices(num);
}
