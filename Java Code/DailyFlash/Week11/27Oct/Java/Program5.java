class Program5{

	public static void main(String[] args){
	
		int[][] arr = new int[][]{{1},{1,1},{1,2,1},{1,3,3,1}};
		for(int i=0;i<4;i++){
		
			for(int j=3;j>i;j--){
			
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
			
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
	}
	

}
