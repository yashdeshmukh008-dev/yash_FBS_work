#include<stdio.h>
#include<string.h>
typedef struct student{
   int roll_no;
   char name[20];
   int marks;
} student;
student store();
void main(){
	student s1,s2,s3;
	printf("enter the data of first student:");
	s1 = store();
	displaydata(s1);
}
student store(){
	student s;
	scanf("%d",&s.roll_no);
	scanf("%s",s.name);
	scanf("%d",&s.marks);
	return s;
}
void displaydata(student s){
	printf("%d",s.roll_no);
	printf("%s",s.name);
	printf("%d",s.marks);
	
}
