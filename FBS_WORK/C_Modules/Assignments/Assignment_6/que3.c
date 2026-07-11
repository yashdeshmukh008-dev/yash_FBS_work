#include<stdio.h>
void leaf(){
int yr = 2026;
if((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)){
    printf("year is leaf");
}
else
printf("year is not leaf");
  
}
void main(){
  leaf();
}
