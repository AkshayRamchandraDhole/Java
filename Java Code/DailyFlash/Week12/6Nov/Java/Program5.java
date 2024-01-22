class StudentData{

	StudentData(){
		
		System.out.println("Calling Default Constructor");
		System.out.println("Name : Akshay");
		System.out.println("RollNo : 17");
		System.out.println("College : SITS Narhe");
		System.out.println("class : BEA");
	}
	StudentData(String str,int roll,String clg,String cls){
	
		System.out.println("Calling Parameterized Constructor");
		System.out.println("Name : "+str);
		System.out.println("RollNo : "+roll);
		System.out.println("College : "+clg);
		System.out.println("Class : "+cls);
	}

	public static void main(String[] args){
	
		new StudentData();
		new StudentData("Krishna",58,"SITS Narhe","BEB");
	}
}
