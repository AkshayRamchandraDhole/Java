class Program2{

	public static void main(String[] args){

		int[][] arr = new int[3][];
		
		arr[0] = new int[]{10};
		arr[1] = new int[]{20,30};
		arr[2] = new int[]{40,50,60,70};
		
		System.out.println("Jagged Array is : ");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
