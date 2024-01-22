class Program5{

	int a=10;
	String nm="Akshay";
	boolean val=true;
	Program5(int s0,String s1,boolean s3){
	
		
		System.out.println("In Default Constructor");
		
		a=s0;
		nm=s1;
		val=s3;

		System.out.println("A : "+a);
		System.out.println("Name : "+nm);
		System.out.println("Value : "+val);
	
	}

	public static void main(String[] args){

		Program5 p = new Program5(18,"Gaurav",true);

	}
}
