#include<stdio.h>
void multiply(int x, int a){
  
  while(x<=10){
    printf("%d",a*x);
    x++;
  }
}
void main(){
   int x = 1;
  int a = 5;
  multiply(x,a);
}
