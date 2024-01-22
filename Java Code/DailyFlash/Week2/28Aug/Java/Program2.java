class Program2{

	public static void main(String args[]){
	
		int iCount=1;
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=i;j++){

				if(i==1)
					System.out.print(iCount+" ");
				else
					System.out.print(" "+iCount);
				iCount++;
			}
			System.out.println();
		}
	}
}
