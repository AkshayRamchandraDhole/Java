class Program22{

	public static void main(String[] args){
	
		int temp;
		for(int i=1;i<=10;++i){
		
			temp=((1+10)-i);
			if(temp % 2 == 0)
				System.out.printf("%3d ",temp*temp);
			else
				System.out.printf("%3d ",temp*temp*temp);
		}
	}
}
