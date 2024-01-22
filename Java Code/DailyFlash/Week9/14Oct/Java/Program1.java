class Program1{

	public static void main(String[] args){
	
		int[][] arr= {{145,6,655,321},
			   {98,87,22,44},
			   {87,21,33,11}
		};
		int len=0;
		for(int i=0;i<3;i++){
		
			for(int j=0;j<4;j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			len++;
		}
		System.out.println("Length of 2D Array is : "+len);
	}
}
