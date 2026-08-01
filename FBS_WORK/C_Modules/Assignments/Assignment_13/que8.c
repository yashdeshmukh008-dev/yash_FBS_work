#include <stdio.h>
#include <stdlib.h>

void mergeArray(int a[],int b[],int c[],int n1,int n2)
{
    int i;

    for(i=0;i<n1;i++)
        c[i]=a[i];

    for(i=0;i<n2;i++)
        c[n1+i]=b[i];
}

int main()
{
    int n1,n2;

    scanf("%d%d",&n1,&n2);

    int *a=(int *)malloc(n1*sizeof(int));
    int *b=(int *)malloc(n2*sizeof(int));
    int *c=(int *)malloc((n1+n2)*sizeof(int));

    for(int i=0;i<n1;i++)
        scanf("%d",&a[i]);

    for(int i=0;i<n2;i++)
        scanf("%d",&b[i]);

    mergeArray(a,b,c,n1,n2);

    for(int i=0;i<n1+n2;i++)
        printf("%d ",c[i]);

    free(a);
    free(b);
    free(c);
}
