class Job{

	Job(String role,int sal,int id){
	
		System.out.println("Role :"+role);
		System.out.println("Salary :"+sal);
		System.out.println("Id :"+id);
	}
}
class Person{

	void jobReq(){
	
		Job j = new Job("Software Engineer",800000,2872);
	}
	public static void main(String[] args){
	
		new Person().jobReq();
	}
}
