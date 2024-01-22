class Company{

	String cmpName = "BMC Software";
	private String name = "Rahul";
	private int age = 29;

	Company(){
	
		System.out.println("In No-args Constructor");
	}

	Company(String empName,int empAge){
	
		name = empName;
		age = empAge;
	}
	void display(){
	
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Company Name="+cmpName);
	}
}
class Employee{

	//private int age=10;

	public static void main(String[] args){
	
		Company rahul = new Company();
		rahul.display();

		Company kanha = new Company("Kanha",28);
		//kanha.age=30;
		kanha.display();

		//Employee e = new Employee();
		//System.out.println(e.age);
	}
}
