
#include <stdio.h>
void odd_even(int a){
    
   if(a%2 == 0){
      printf("number is even");   
    }
      else
      printf("number is odd");
}
int main() {
    
   
    int a = 10;
    odd_even(a);

    return 0;
}
