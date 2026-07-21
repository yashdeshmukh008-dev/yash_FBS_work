#include<stdio.h>
void main(){
	printf("Enter the array size");
	int size;
	scanf("%d",&size);
	int arr[size];
	printf("Enter the array element");
	for(int i = 0;i<size;i++){
		scanf("%d",&arr[i]);
	}
	
	int sum = 0;
	for(int i = 0;i<size;i++){
		sum = sum + arr[i];
	}
	printf("%d",sum);
}
