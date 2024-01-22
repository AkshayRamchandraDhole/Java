class Program4{

	public static void main(String args[]){
	
		int a=10,b=20,c=30;
		int arr[]={10,8,56,23,45,97};
		int tmp;
		System.out.println("Number Are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
			
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
			}
		}
		System.out.println();
		System.out.println("Second Highest Number:");
		for(int i=1;i<2;i++)
			System.out.println(arr[i]+" ");
	}
}
