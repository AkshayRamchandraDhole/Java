class Program2{

	public static void main(String[] args){
	
		int[] arr1 = new int[]{5,10,15,20,25};
		System.out.println("Array is : ");
		for(int i = 0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		
		System.out.println("\n Reverse Array is : ");
		for(int i = arr1.length-1;i>=0;i--)
			System.out.print(arr1[i]+" ");

	}
}
