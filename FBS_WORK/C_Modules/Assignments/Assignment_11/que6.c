#include<stdio.h>
#include<string.h>
void myspacefun(char*,char);
void main(){
	char ch[20];
	printf("enter the string");
	gets(ch); 
	char cha;
	scanf("%c",&cha);
	myspacefun(ch,cha);
	printf("%s ",ch);
}
void myspacefun(char ch[],char cha){
	int i =0;
	while(ch[i]!='\0'){
		if(ch[i]==' ')
		ch[i] =cha;
		i++;
	}
}
