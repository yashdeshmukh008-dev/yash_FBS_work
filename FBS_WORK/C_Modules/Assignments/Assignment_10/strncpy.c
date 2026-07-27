#include <stdio.h>
#include <string.h>

int main() {
    char source[] = "Programming";
    char destination[20];

    strncpy(destination, source, 5);
    destination[5] = '\0';

    printf("%s", destination);

    return 0;
}
