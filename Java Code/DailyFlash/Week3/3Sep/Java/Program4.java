class Program4{

	public static void main(String args[]){
	
		int iNum=1;
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(iNum*iNum*iNum+" ");
				iNum+=1;
			}
			System.out.println();
		}
	}
}
