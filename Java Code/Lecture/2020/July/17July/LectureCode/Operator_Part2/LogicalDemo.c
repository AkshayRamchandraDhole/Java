#include<stdio.h>
void main(){

	int x = 10;
	int y = 20;
	int ans;

	ans = x && y;
	printf("%d\n",ans);	// 1
	
	ans = x || y;
	printf("%d\n",ans);	// 1
	
	int x1 = 5 ;
	int y1 = 10;
	_Bool ans1;

	ans1 = x && y;
	printf("%d\n",ans);	// 1
}
