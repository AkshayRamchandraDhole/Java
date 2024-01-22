class WhileDemo2{

	public static void main(String args[]){
	
		int num = 143;
		int rem = 0 , sum = 0;
		while(num!=0){
		
			rem=num%10;
			sum=sum+rem;
			num=num / 10;
		}
	/*	int num=143;
		int rem=0,sum=0;
		for(;num % 2 ==0 && num !=0;num=num/10){
			rem=num%10;
			sum=sum+rem;
			System.out.println(num);
		}
		System.out.println("Sum="+sum);*/
	/*	char j='a';
		char i='A';
		for(;i<99 && j<123;i++,j++)
			System.out.println("j="+j+" i="+i);
			*/
	}
}
