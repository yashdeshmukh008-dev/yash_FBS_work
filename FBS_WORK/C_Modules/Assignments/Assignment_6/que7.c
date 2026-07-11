#include<stdio.h>
int operation(){
  int a = 5;
  int b = 6;
  char op = '+';
  if(op == '+'){
  c = a + b;
  printf("%d",c);
}
else if(op == '-'){
  c = a - b;
  printf("%d",c);
}
else if(op == '*'){
  c = a * b;
  printf("%d",c);
}
 else if(op == '/'){
  c = a / b;
  printf("%d",c);
}
  else if(op == '%'){
  c = a % b;
  printf("%d",c);
}

}
void main(){
  operation();
}
