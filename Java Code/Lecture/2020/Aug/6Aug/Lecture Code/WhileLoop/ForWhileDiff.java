class ForWhileDiff{

	public static void main(String args[]){
	
	//	int num=143;
	//	int rem=0,sum=0;
		int sum=0;
		for(int num=143,rem=0;num!=0;num=num/10){
			rem=num%10;
			sum=sum+rem;
		//	num=num/10;
		}
	/*	int num=143;
		int rem=0,sum=0;
		
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}*/
		System.out.println("Sum="+sum);
	}
}
