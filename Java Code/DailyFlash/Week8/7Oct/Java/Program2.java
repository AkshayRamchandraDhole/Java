class Program2{

	public static void main(String[] args){
	
	
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[4];

		int num=1;
		System.out.println("The Elements are : ");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				arr[i][j]=num;
				System.out.print(arr[i][j]*arr[i][j]+" ");
				num++;
			}
			System.out.println();
		}
	}
}
