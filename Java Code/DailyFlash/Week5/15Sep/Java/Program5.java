class Program5{

	public static void main(String args[]){
		int num=1,tmp=3;
		for(int row=1;row<=5;row++){
	
			for(int col=5;col>=row;col--){

				System.out.print(num+" ");
				num++;
				
			}
			num-=tmp;
			tmp--;
			System.out.println();
		}
	}
}
