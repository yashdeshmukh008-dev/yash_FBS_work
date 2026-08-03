#include <stdio.h>

struct Employee
{
    int id;
    char name[30];
    float salary;
};

void store(struct Employee *e)
{
    printf("Enter ID Name Salary: ");
    scanf("%d%s%f",&(*e).id,(*e).name,&(*e).salary);
}

void display(struct Employee *e)
{
    printf("\nID = %d",(*e).id);
    printf("\nName = %s",(*e).name);
    printf("\nSalary = %.2f",(*e).salary);
}

void main()
{
    struct Employee e1;

    store(&e1);
    display(&e1);
    
}
