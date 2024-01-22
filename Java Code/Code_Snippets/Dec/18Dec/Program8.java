class Core2web{
	
	 int manMem = 40;
	static class Management{

			void organizeAdmission(){
			
				manMem+=1;
				System.out.println(manMem);
			}
		}

	public static void main(String[] args){
	
		new Management().organizeAdmission();
	}
}
