class SpacePattern2{

	public static void main(String args[]){
	
		char ch='A';
		int num=1;
		for(int row=1;row<=5;row++){
		
			for(int space=4;space>=row;space--){
			
				System.out.print("  ");
			}

			for(int col=1;col<=row*2-1;col++){
			
				if(row%2==0){
					System.out.print(ch+" ");
				}
				else{
					System.out.print(num+" ");
				}
			}
			if(row%2==0)
				ch++;
			num++;
			System.out.println();
		}
	}
}
