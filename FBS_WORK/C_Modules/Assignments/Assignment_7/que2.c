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
	printf("Enter the element to search: ");
	int search;
	scanf("%d",&search);
	int flag = 0;
	for(int i = 0;i<size;i++){
		if(arr[i] == search){
		flag = 1;
		break;
	}
	}
	if(flag)
	printf("element is present");
	else
	printf("element is not present");

}
