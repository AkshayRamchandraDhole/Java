class Program13{

	public static void main(String args[]){
	
		int sum=0;
		int num=9;
		int squ=num*num;
		int tmp=squ;
		System.out.println("Num="+num);
		System.out.println("Squ="+squ);
		while(squ!=0){
		
			int rem=squ%10;
			sum=sum+rem;
			squ=squ/10;
		}
		if(num==sum)
			System.out.println(num+" is a neon number");
		else
			System.out.println(tmp+" is not a neon number");
	}
}
