#include <stdio.h>

struct Time
{
    int hrs, min, sec;
};


void accept(struct Time *t)
{
    printf("Enter hours: ");
    scanf("%d", &t->hrs);

    printf("Enter minutes: ");
    scanf("%d", &t->min);

    printf("Enter seconds: ");
    scanf("%d", &t->sec);
}


void display(struct Time t)
{
    printf("%d hrs %d min %d sec\n", t.hrs, t.min, t.sec);
}


int toSeconds(struct Time t)
{
    return (t.hrs * 3600) + (t.min * 60) + t.sec;
}


struct Time addTime(struct Time t1, struct Time t2)
{
    struct Time result;

    result.sec = t1.sec + t2.sec;
    result.min = t1.min + t2.min;
    result.hrs = t1.hrs + t2.hrs;

    if (result.sec >= 60)
    {
        result.sec = result.sec - 60;
        result.min++;
    }

    
    if (result.min >= 60)
    {
        result.min = result.min - 60;
        result.hrs++;
    }

    return result;
}

int main()
{
    struct Time t1, t2, result;

    printf("Enter first time:\n");
    accept(&t1);

    printf("\nFirst time: ");
    display(t1);

    printf("First time in seconds: %d\n", toSeconds(t1));

    printf("\nEnter second time:\n");
    accept(&t2);

    printf("\nSecond time: ");
    display(t2);

    printf("Second time in seconds: %d\n", toSeconds(t2));

    result = addTime(t1, t2);

    printf("\nAddition of two times: ");
    display(result);

    return 0;
}
