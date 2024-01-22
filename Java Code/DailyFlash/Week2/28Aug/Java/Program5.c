#include<stdio.h>
void main(){

	int fact=1;
	for(int i=1;i<=5;i++)
		fact*=i;
	printf("The Factorial of 5 is:%d\n",fact);
}
