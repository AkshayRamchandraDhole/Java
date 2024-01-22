class Program8{

	public static void main(String args[]){
	
		int num=145;
		System.out.println("Num="+num);
		while(num!=0){
		
			int rem=num%10;
			int count=0;
			for(int i=1;i<=rem;i++){
			
				if(rem%i==0)
					count++;
			}
			if(count==2)
				System.out.println("The Prime Digit from Number is:"+rem);
			num=num/10;
		}
	}
}
