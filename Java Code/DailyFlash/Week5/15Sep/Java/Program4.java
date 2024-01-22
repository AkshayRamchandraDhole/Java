class Program4{

	public static void main(String args[]){
		int num=1,tmp=1,tp=0;
		for(int row=1;row<=5;row++){
	
			for(int col=5;col>=row;col--){

				if(col==5){
					tp=tmp*tmp;
					System.out.print(tp+"\t");
					tmp++;

					num=tp;
				}
				else{
					num+=row;
					System.out.print(num+"\t");
							
				}
				
			}
			
			System.out.println();
		}
	}
}
