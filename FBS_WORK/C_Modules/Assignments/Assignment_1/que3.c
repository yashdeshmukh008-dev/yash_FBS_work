#include<stdio.h>
void main(){
int yr = 2026;
if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
    printf("year is leaf");
}
else
printf("year is not leaf");
  
}