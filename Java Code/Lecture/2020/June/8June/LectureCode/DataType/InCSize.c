#include<stdio.h>
void main(){

	//printf("Byte=%ld\n",sizeof(byte));    error: ‘byte’ undeclared (first use in this function)

	printf("Short=%ld in bytes\n",sizeof(short));
	printf("Int=%ld in bytes\n",sizeof(int));
	printf("Long=%ld in bytes\n",sizeof(long));
	printf("Float=%ld in bytes\n",sizeof(float));
	printf("Double=%ld in bytes\n",sizeof(double));
	printf("Character=%ld in bytes\n",sizeof(char));
	printf("Boolean=%ld in bytes\n",sizeof(_Bool));
}
