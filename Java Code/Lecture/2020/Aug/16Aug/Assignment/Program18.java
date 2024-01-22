class Program18{

	public static void main(String args[]){
	
		int rev=0;
		int num=83673;
		System.out.println("Num="+num);
		while(num!=0){
		
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse="+rev);
	}
}
