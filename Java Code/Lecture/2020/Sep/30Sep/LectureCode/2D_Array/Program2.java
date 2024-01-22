import java.util.*;
class MultiArray2{

	public static void main(String[] args){
	
		//int marr[][] = {};
		//int marr[][] = {1,2,3,4,5,6,7,8,9};
		int marr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//int marr[][] = {{1,2,3},{,5,},{,6,8}};

		//System.out.println(marr.getClass());

		 System.out.println("Element of Array is : ");
		 for(int i=0;i<3;i++){
		 
			 for(int j=0;j<3;j++){
			 
				 System.out.print(marr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}
