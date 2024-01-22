#include<stdio.h>
void main(){

	int marr [3][3] ={{1,2,3},{5},{6,7,8}};
	for(int i=0;i<3;i++){
	
		for(int j=0;j<3;j++){
		
			printf("%d ",marr[i][j]);
		}
		printf("\n");
	}
}
