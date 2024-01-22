class Core2web{

	public int sum(int num1,int num2){
	
		return num1+num2+5;
	}
	public int sum(int ...num){
	
		int sum=0;
		for(int x:num){
		
			sum=sum+x;
		}
		return sum+10;
	}

	public static void main(String[] args){
	
		System.out.println(new Core2web().sum(10,20));
		System.out.println(new Core2web().sum(10,20,30));

	}
}
