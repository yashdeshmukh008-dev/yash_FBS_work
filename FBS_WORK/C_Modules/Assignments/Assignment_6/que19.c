#include <stdio.h>

void perfect(int n) {
    int sum = 0;

    n = 28;

    for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0)
            sum += i;
    }

    if (sum == n)
        printf("Perfect");
    else
        printf("Not Perfect");

  
}
void main(){
  int a = 12;
  perfect(a);
}
