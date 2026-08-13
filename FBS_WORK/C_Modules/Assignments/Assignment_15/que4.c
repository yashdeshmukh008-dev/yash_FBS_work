#include <stdio.h>
#include <string.h>

struct Product
{
    char name[50];
    float price;
    int quantity;
};

int main()
{
    struct Product cart[50];
    int n, i;
    float total = 0;

    printf("Enter number of products: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("\nEnter details of product %d:\n", i + 1);

        printf("Enter product name: ");
        scanf(" %[^\n]", cart[i].name);

        printf("Enter price: ");
        scanf("%f", &cart[i].price);

        printf("Enter quantity: ");
        scanf("%d", &cart[i].quantity);
    }

    printf("\n========== BILL ==========\n");
    printf("%-20s %-10s %-10s %-10s\n",
           "Product", "Price", "Quantity", "Total");

    for (i = 0; i < n; i++)
    {
        float itemTotal = cart[i].price * cart[i].quantity;

        printf("%-20s %-10.2f %-10d %-10.2f\n",
               cart[i].name,
               cart[i].price,
               cart[i].quantity,
               itemTotal);

        total = total + itemTotal;
    }

    printf("------------------------------\n");
    printf("Grand Total: %.2f\n", total);

    return 0;
}
