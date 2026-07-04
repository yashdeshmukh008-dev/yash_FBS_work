#include<stdio.h>
void main(){
  int start = 1;
  int end = 5;
  int result = 0;
  while (start<=end){
    result = result + start;
    start++;
  }
  printf("%d",result);
}
