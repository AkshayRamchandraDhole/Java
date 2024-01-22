class Program21{

	public static void main(String[] args){
	
		int temp;
		for(int i=10;i<=30;i++){
		
			temp=((10+30)-i);
			if(temp % 3 == 0 || temp % 5 == 0)
				System.out.print(temp + " ");
		}
	}
}
