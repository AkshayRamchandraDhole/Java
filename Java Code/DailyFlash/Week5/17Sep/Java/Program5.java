class Program5{

	public static void main(String arsg[]){
		int tmp=1;
		for(int row=1;row<=12;row++){
			char ch ='A';
			if(row>6){
				
				for(int col=1;col<=tmp;col++){
		
					System.out.print(ch+" ");
					ch++;	
				}
				tmp++;
			}else{
			
				for(int col=6;col>=row;col--){
				
					System.out.print(ch+" ");
					ch++;
				}
			}	
			System.out.println();
		}
	}
}
