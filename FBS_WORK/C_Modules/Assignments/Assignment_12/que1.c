#include <stdio.h>

int main() {
    char str[100], ch;
    int i, found = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    printf("Enter a character to search: ");
    scanf("%c", &ch);

    for(i = 0; str[i] != '\0'; i++) {
        if(str[i] == ch) {
            found = 1;
            break;
        }
    }

    if(found)
        printf("Character found.");
    else
        printf("Character not found.");

    return 0;
}
