#include<stdio.h>
void triangle(){
  int a = 4;
  int b = 5;
  int c = 8;
  if (a == b && b == c) {
            printf("The triangle is Equilateral");
        }
        else if (a == b || b == c || a == c) {
            printf("The triangle is Isosceles");
        }
        else {
            printf("The triangle is Scalene");
        }
}
void main(){
  triangle();
}
