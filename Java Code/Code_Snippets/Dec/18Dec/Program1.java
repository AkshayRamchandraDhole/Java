class Core2web{

	static int manMem=40;

	void admission(){
	
		class Management{
		
			void organizeAdmission(){
			
				manMem+=1;
				System.out.println(manMem);
			}
		}
		new Management().organizeAdmission();
	}
	public static void main(String[] args){
	
		new Core2web().admission();
	}
}
