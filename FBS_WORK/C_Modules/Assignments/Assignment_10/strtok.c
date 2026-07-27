#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Red,Green,Blue";

    char *token = strtok(str, ",");

    while(token != NULL) {
        printf("%s\n", token);
        token = strtok(NULL, ",");
    }

    return 0;
}
