class Program15{

	public static void main(String args[]){
	
		int num=8;
		int count=0;
		System.out.println("Num="+num);
		while(num>0){
		
			if(num % 2==0)
				num/=2;
			else if(num==3 || num % 4 == 1)
				num-=1;
			else
				num+=1;
			count++;
		}
		System.out.println("Count="+count);
	}
}
