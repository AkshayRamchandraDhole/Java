class Program20{

	public static void main(String args[]){
	
		char chA='A';
		char cha='a';
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=4;j++){
				if(i%2==0){
				System.out.print(cha+" ");
				cha++;
				}else{
				
					System.out.print(chA+" ");
					chA++;
				}
			}
			System.out.println();
		}
	}
}
