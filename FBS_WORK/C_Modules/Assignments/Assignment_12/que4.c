#include <stdio.h>

int main() {
    char str[100], temp;
    int len = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    while(str[len] != '\0') {
        len++;
    }

    if(str[len - 1] == '\n')
        len--;

    temp = str[0];
    str[0] = str[len - 1];
    str[len - 1] = temp;

    printf("New String: %s", str);

    return 0;
}
