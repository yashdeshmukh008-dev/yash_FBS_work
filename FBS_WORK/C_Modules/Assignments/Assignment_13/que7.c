#include <stdio.h>
#include <stdlib.h>

void addArray(int a[], int b[], int c[], int n)
{
    for(int i=0;i<n;i++)
        c[i]=a[i]+b[i];
}

void display(int arr[], int n)
{
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
}

int main()
{
    int n;

    scanf("%d",&n);

    int *a=(int *)malloc(n*sizeof(int));
    int *b=(int *)malloc(n*sizeof(int));
    int *c=(int *)malloc(n*sizeof(int));

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    for(int i=0;i<n;i++)
        scanf("%d",&b[i]);

    addArray(a,b,c,n);

    display(c,n);

    free(a);
    free(b);
    free(c);
}
