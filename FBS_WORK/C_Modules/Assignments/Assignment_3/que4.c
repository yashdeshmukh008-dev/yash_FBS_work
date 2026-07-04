#include<stdio.h>
void main(){
  int num = 7;
  int a = 2;
  while(a<num){
    if(num % a == 0)
      printf("number is not prime");
        else 
        printf("number is prime");
    a++;
  }
}
