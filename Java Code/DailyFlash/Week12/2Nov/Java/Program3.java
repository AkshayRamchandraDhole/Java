class Program3{

	public Program3(){

		System.out.println("Public Default Constructor");
	}
	
	public Program3(int a){

		System.out.println("Public Parameterized Constructor");
	}
	
	private Program3(int a,int b){

		System.out.println("Private Parameterized Constructor");
	}
	
	Program3(int a,int b,int c){

		System.out.println("Default Parameterized Constructor");
	}



	public static void main(String[] args){

		Program3 p1 = new Program3();
		Program3 p2 = new Program3(10);
		Program3 p3 = new Program3(10,20);
		Program3 p4 = new Program3(10,20,30);

	}
}
