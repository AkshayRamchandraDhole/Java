#include<stdio.h>
void main(){

	int num = 20;
	int ans = 0;

	ans = ++num + ++num; 	// int pre(){
					//	num = num + 1;
					//	return num;
						
				//		}
	printf("%d\n",ans);	// 44
	printf("%d\n",num);	// 22


	/* postIncrement:
	 * 	 
	 * 	 int postinc(){
	 *		
	 *		int tmp;
	 *		tmp =num;
	 *		num=num+1;
	 *		return tmp;
	 * 	 }
	 *
	 * */

	
	ans = num++ + num++;
	printf("%d\n",ans);	// 45
	printf("%d\n",num);	// 24
}
