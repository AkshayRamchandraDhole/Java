class Program9{

	public static void main(String args[]){
	
		int rev=0;
		int num=7547;
		int tmp=num;
		System.out.println("Num="+num);
		while(num!=0){
		
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==tmp)
			System.out.println(tmp+" is a palindrome number");
		else
			System.out.println(tmp+" is not a palindrome number");
	}
}
