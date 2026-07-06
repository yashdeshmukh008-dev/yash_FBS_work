#include <stdio.h>

void main() {
    int minutes = 135;
    int hours, remainingMinutes;

    hours = minutes / 60;
    remainingMinutes = minutes % 60;

    printf("Total Minutes = %d\n", minutes);
    printf("Hours = %d\n", hours);
    printf("Remaining Minutes = %d\n", remainingMinutes);

    
}
