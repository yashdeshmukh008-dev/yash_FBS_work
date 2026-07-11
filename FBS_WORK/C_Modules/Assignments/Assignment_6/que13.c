#include <stdio.h>

void age_check() {
    int age = 25;

    if (age < 12) {
        printf("Child\n");
    }
    else if (age >= 12 && age <= 19) {
        printf("Teenager\n");
    }
    else if (age >= 20 && age <= 59) {
        printf("Adult\n");
    }
    else {
        printf("Senior\n");
    }

    
}
void main(){
age_check();
}
