class Program4{

	public static void main(String ...args){
	
		int iNum=7;
		int tmp=0;
		for(int i=0;i<4;i++){
		
			iNum=7-i;
			for(int j=0;j<=i;j++){
			
				System.out.print(iNum+" ");
				iNum--;

			}
			System.out.println();

		}
	}
}
