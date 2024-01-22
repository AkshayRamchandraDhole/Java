class Program16{

	public static void main(String args[]){
		int i=1;
		while(i<=100){
		boolean flag=false;
		int num=i;
		int tmp=num;
		while(num!=0){
		
			int rem = num % 10;
			if(rem==0)
				break;
			if(tmp%rem==0)
				flag=true;
			else{
				flag=false;
				break;
			}
			num=num/10;
		}
		if(flag==true)
			System.out.println(tmp+" is self dividing number");
		i++;
		}
	}

}
