class Program3{

	public static void main(String args[]){
	
		int count=0,freq=6;
		int num=36676562;
		while(num!=0){
		
			int rem = num % 10 ;
			if(freq==rem)
				count++;
			num=num/10;
		}
		System.out.println("Count of "+freq+" is:"+count);
	}
}
