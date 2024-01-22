class Member{

	String name="Akshay";
	int age=22;
	long phoneNo=1234567890;
	String add="Akola Maharashtra";
	double sal=20000.0;

	void printSalary(){
	
		System.out.println("Salary = "+sal);
	}
}
class Employee extends Member{

	String spec="B.E";
	String dept="Comp";

	void empData(String name,int age,long phone,String add,double sal){
	
		System.out.println("Using Employee Obj");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Phone = "+phone);
		System.out.println("Address = "+add);
		System.out.println("Salary = "+sal);
		System.out.println("Specification = "+spec);
		System.out.println("Department = "+dept);
	}

}
class Manager extends Member{

	String spec="M.E";
	String dept="Comp";
	
	void manData(String name,int age,long phone,String add,double sal){
	
		System.out.println("Using Manager Obj");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Phone = "+phone);
		System.out.println("Address = "+add);
		System.out.println("Salary = "+sal);
		System.out.println("Specification = "+spec);
		System.out.println("Department = "+dept);
}
}
class Run{

	public static void main(String[] args){
	
		Employee emp = new Employee();
		emp.empData("Gaurav",28,87534332l,"Akola",34327.00);
		Manager man = new Manager();
		man.manData("Dv",28,87534332l,"Akola",40000.00);
	}
}




