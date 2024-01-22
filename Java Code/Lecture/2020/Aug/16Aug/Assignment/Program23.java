	class Program23{

	public static void main(String args[]){
	
		int num1=10,num2=15,max,lcm=0;
		if(num1>num2)
			max=num1;
		else
			max=num2;
		while(num1!=0){
		
			if(max % num1 == 0 && max % num2 == 0){
			
				lcm=max;
				break;
			}
			max+=1;
		}
		System.out.println("LCM:"+lcm);
	}
}
