class Program4{

	static public void main(String ...args){
	
		int iNum=7;
		for(int i=0;i<4;i++){
		
			for(int j=0;j<=i;j++){
			
				System.out.print(iNum+" ");
				iNum-=1;
			}
			System.out.println();
			iNum+=1;
		}
	}


}
