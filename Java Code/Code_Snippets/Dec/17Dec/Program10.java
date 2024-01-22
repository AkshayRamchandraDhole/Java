class Core2web{

	static int managementMembers=40;
	
	static void admission(){
	
		class Management{
	
			 void organizeAdmission(){
		
			managementMembers+=1;
			System.out.println(managementMembers);
		}
	}
	new Management().organizeAdmission();;
	}
	public static void main(String[] args){
	
		new Core2web().admission();

	}
	
}
