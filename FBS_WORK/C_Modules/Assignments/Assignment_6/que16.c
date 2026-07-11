#include<stdio.h>
void addition(int start, int end){
  
  int result = 0;
  while (start<=end){
    result = result + start;
    start++;
  }
  printf("%d",result);
}
void main(){
  int start = 1;
  int end = 5;
  addition(start,end);
}
