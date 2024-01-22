class Program6{

	public static void main(String args[]){
	
		int sum=0;
		int num=28;
		System.out.println("Num="+num);
		for(int i=1;i<num;i++){
		
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
			
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not perfect number");

	}
}
