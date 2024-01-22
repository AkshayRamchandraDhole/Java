class GivenArray{

	public static  void main(String[] args){

		int []arr={1,5,5,5,6,8,8,9,12,5};
		int num=5;
		int temp=0;
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				temp++;
				index=i;	
			}
			if(temp==1 && arr[i]==5)
				System.out.println("First occurance of 5 is : "+i);
		}

		System.out.println("last occurance of 5 is : "+index);
	}
}
