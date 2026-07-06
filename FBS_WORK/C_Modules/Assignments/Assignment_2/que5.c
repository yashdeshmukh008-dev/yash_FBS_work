#include <stdio.h>

void main() {
    float price = 650.0;
    char student = 'y';   // 'y' = student, 'n' = not student

    float discount = 0.0, finalPrice;

    if (student == 'y' || student == 'Y') {
        if (price > 500) {
            discount = 0.20 * price;
        } else {
            discount = 0.10 * price;
        }
    } 
    else if (student == 'n' || student == 'N') {
        if (price > 600) {
            discount = 0.15 * price;
        } else {
            discount = 0.0;
        }
    }

    finalPrice = price - discount;

    printf("Price = %.2f\n", price);
    printf("Student = %c\n", student);
    printf("Discount = %.2f\n", discount);
    printf("Final Price = %.2f\n", finalPrice);

   
}
