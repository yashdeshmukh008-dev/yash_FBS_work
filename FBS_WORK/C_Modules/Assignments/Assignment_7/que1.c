#include<stdio.h>

void main(){
	
  printf("Enter the size of array");
  int size;
  scanf("%d",&size);
  int arr[size];
  printf("Enter the array element");
  for(int i = 0;i<size;i++){
  	scanf("%d",&arr[i]);
  }
  int max = arr[0];
  int min = arr[0];
  for(int i=0;i<size;i++){
  	if(arr[i]>max){
  		max = arr[i];
	  }
	  if(arr[i]<min){
	  	min = arr[i];
	  }
  }
  printf("minimum number is %d ",min);
  printf("maximum number is %d ",max);

}

