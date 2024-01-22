class Program4{

	public static void main(String args[]){
	
		int n=4,x,y;
		x=n;
		y=n;
		for(int row=1;row<=n;row++){

			for(int col=1;col<=n*2+1;col++){
					
				if(col==x || col==y)

					System.out.print(row+" ");
				else
					System.out.print("  ");

			}
			x-=1;
			y+=1;
			System.out.println();
		}
	}
}
