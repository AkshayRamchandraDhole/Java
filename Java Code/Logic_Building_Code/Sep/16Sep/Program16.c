#include<stdio.h>
void main(void){

	long num=9;
	int n;
	printf("Enter a num: ");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
	
		printf("%ld ",num);
		num=num*10+9;
	}
	printf("\n");
}
