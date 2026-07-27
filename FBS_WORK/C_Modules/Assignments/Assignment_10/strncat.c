#include <stdio.h>
#include <string.h>

int main() {
    char str1[30] = "Good";
    char str2[] = "Morning";

    strncat(str1, str2, 4);

    printf("%s", str1);

    return 0;
}
