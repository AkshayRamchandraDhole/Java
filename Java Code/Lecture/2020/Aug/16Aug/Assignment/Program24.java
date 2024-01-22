class Program24{

	public static void main(String args[]){
	
		int count=0;
		int num=83673;
		System.out.println("Num="+num);
		while(num!=0){
		
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Count="+count);
	}
}
