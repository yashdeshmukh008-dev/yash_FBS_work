#include <stdio.h>

int IsPrime(int a) {
     
         int j, prime;
         prime = 1;
         for (j = 2; j <= a / 2; j++) {
            if (a % j == 0) {
                prime = 0;
                break;
            }
        }
 
}
void main(){
  int n = 100; 
  for(int i = 2;i<n;i++){
    if(IsPrime(i))
    printf("%d ",i);
    
  }
}
