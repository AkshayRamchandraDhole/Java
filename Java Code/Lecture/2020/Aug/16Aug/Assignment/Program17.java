class Program17{

	public static void main(String args[]){
	
		int count=0;
		int num=10;
		System.out.println("Num="+num);
		for(int i=1;i<=num;i++){
		
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("It is prime number:"+num);
		else
			System.out.println("It is not prime number:"+num);
	}
}
