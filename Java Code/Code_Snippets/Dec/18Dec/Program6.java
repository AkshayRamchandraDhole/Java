class Core2web{
	
	static class Management{
		
			static int manMem=40;

			void organizeAdmission(){
			
				manMem+=1;
				System.out.println(manMem);
			}
		}

	public static void main(String[] args){
	
		new Management().organizeAdmission();
	}
}
