import java.util.*;
class Employee implements Comparable<Employee>{
	
	int empId;
	String name;
	float sal;

	Employee(int empId,String  name,float sal){
		
			this.empId=empId;
			this.name=name;
			this.sal=sal;
	}
	
	public int compareTo(Employee Obj){
		return (int)(sal-Obj.sal);
	}
	void disp(){
			System.out.println(empId+" "+name+" "+sal);
	}

}
class Demo{

	public static void main(String[] args){
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(3,"Kanha",85000));
		al.add(new Employee(1,"Rahul",75000));
		al.add(new Employee(2,"Ashish",95000));
		
		Collections.sort(al);
		
		for(Employee e : al){
			e.disp();
		}
	}
}
