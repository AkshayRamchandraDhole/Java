class Pattern5{

	public static void main(String args[]){
		int iNum = 0 ,sum=0;
		for(int i=1;i<=3;i++){
		
			for(int j=1;j<=3;j++){
				sum=sum+iNum;
				System.out.print(sum+" ");
				if(i==1 && j==1)
					iNum=iNum+3;
				else
					iNum=iNum+2;


					
			}
			System.out.println();
		}
	}
}
