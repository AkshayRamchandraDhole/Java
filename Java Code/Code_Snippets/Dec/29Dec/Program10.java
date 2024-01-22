class BiEncaps{

	final void printEmpDe(){
	
		System.out.println("There are 25 emp");
	}
}
class Core2web extends BiEncaps{

	void  printEmpDe(){
	
		System.out.println("There are 25 emp");
	}
	public static void main(String[] args){
	
		new Core2web().printEmpDe();
	}
}
