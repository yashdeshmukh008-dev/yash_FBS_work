#include<stdio.h>
typedef struct book{
	char bname[20];
	int id;
	char author[20];
	double price;
}book;
book store();
void display(book);
int main(){
	book b1;
	b1 = store();
	display(b1);
	return 0;
}
book store(){
	book b;
	scanf("%s %d %s %lf",b.bname,&b.id,b.author,&b.price );
	return b;
}
void display(book b){
	printf("%s %d %s %lf",b.bname,b.id,b.author,b.price );
}
