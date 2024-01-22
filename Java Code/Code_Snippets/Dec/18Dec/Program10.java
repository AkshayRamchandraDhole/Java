class Core2web{
	
	 int manMem = 40;
	static class Management{

			void organizeAdmission(){
			
				
				System.out.println(new Core2web().manMem);
			}
		}

	public static void main(String[] args){
	
		new Core2web().fun();
	}
	void fun(){
	
		new Management().organizeAdmission();
	}
}
