class Program28{

	public static void main(String[] args){
	
		int n=5;
		for(int row=1;row<=5;row++){
		
			for(int col=5;col>=row;col--){
			
				System.out.print(n+" ");
			}
			n--;
			System.out.println();
		}
	}
}
