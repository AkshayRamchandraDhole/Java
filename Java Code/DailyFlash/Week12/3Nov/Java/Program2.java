class Program2{

	public static void main(String[] args){

		int z=1;
		for(int i=1;i<=6;i++){

			if(i==1 || i==3){
				
					for(int space=2;space>=1;space--){

						System.out.print(" ");
					}
				
				for(int j=1;j<=1;j++){

					System.out.print("^ ");
				}
			}else if(i==2) {

				for(int j=1;j<=2;j++){

					System.out.print(" ^");
				}
			}
			else if(i>3){
				
					for(int l=3;l>=z;l--){
					
						System.out.print(" ~");
					}
					z++;
				}
			System.out.println();
			}
		
	}
}
