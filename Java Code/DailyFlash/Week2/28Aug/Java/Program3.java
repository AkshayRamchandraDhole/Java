class Program3{

	public static void main(String args[]){
	
		int iCount=1;
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=i;j++){

				if(i!=2)
					System.out.print(iCount+" ");
				else
					System.out.print(" "+iCount);
				iCount++;
			}
			System.out.println();
		}
	}
}
