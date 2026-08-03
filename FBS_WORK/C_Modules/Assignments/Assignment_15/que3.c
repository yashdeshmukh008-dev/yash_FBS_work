#include<stdio.h>
typedef struct player{
	char name[20];
	int no_of_matches;
    int runs;
    int wicket;
}player;
void store(player*,int);
void display(player*,int);
int main(){
	player arr[10];
    store(arr,10);
	display(arr,10);
	return 0;
}
void store(player ply[],int size){
	for(int i = 0;i<size;i++){
		scanf("%s %d %d %d",ply[i].name,&ply[i].no_of_matches,&ply[i].runs,&ply[i].wicket);
	}
	

}
void display(player ply[],int size){
	for(int i = 0;i<size;i++){
	
	printf("\n%s %d %d %d",ply[i].name,ply[i].no_of_matches,ply[i].runs,ply[i].wicket );
}
}
