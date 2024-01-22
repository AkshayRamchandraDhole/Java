class Company{

	class Employee{
	
		String name;
		int salary;
		String designation;

		Employee(String nm,int sal,String design){
		
			name=nm;
			salary=sal;
			designation=design;
		}
		void info(){
		
			System.out.println("Name = "+name);
			System.out.println("Salary = "+salary);
			System.out.println("Designation = "+designation);
		}
	}
}
class Test{

	public static void main(String[] args){
	
		//Company c = new Company();
		new Company().new Employee("Akshay",40000,"SW Developer");
		new Company().new Employee("Akshay",40000,"SW Developer").info();
		
	}
}
