class Program3{

	public static void main(String[] args){
	
		int[]arr= {1,3,4,5,6};
		System.out.println("Element of Array is : ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		int tmp=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != tmp){
				System.out.println("Missing Element is : "+(tmp));
				break;
			
			}
			tmp++;
				
		}
	}
}
