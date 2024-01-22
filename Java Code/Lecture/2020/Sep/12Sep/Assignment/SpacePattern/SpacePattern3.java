class SpacePattern3{

	public static void main(String args[]){
	
		int tmp=1;
		for(int row=1;row<=4;row++){

			for(int space=3;space>=row;space--){
			
				System.out.print("  ");
			}
			int num=1,cnt=0;
			for(int col=1;col<=row*2-1;col++){
				cnt++;
				if(cnt>row){
					System.out.print(tmp+" ");
					tmp--;	
				}else{
				
					System.out.print(num+" ");
					tmp=num-1;
					num++;
				}
				
			}
			System.out.println();
		}
	}
}
