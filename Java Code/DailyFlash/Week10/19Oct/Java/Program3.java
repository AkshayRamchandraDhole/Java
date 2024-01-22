class Program3{

	public static void main(String[] args){
	
		int[] arr1 = new int[]{2,16,10,25,23};
		int sum=0;
		System.out.println("Array is : ");
		for(int i = 0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
			sum+=arr1[i];
		}
		
		System.out.println("\n Sum is : "+sum);


	}
}
