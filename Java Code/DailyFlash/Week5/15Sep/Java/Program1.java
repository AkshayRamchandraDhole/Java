class Program1{

	public static void main(String args[]){
	
		char ch='A';
		int tmp=1;
		for(int row=1;row<=5;row++){
		
			for(int space=4;space>=row;space--){
			
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++){
			
				System.out.print(ch+" ");
				ch++;
			}
			if(row > 1){
			
				ch-=tmp;
				tmp++;
			}	
			System.out.println();
		}
	}
}
