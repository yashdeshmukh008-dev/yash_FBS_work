#include<stdio.h>
void main(){
      int a = 121;
      int pal_num;
      int x = a%10;
      int y = a/10;
      pal_num = (pal_num + x ) * 100;
      x = y%10;
      y = y /10;
      pal_num = (pal_num + x ) * 10;
      pal_num = (pal_num + y);
  }