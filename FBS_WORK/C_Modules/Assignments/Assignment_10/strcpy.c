#include <stdio.h>
#include <string.h>

int main() {
    char source[] = "yash";
    char destination[15];

    strcpy(destination, source);

    printf("%s", destination);

    return 0;
}
