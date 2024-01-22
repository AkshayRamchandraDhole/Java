import java.util.*;
class Employee implements Comparable<Employee>{
	
	String empName = null;
	int empid = 0;
	double sal = 0.0;
	
	Employee(String empName,int empid,double sal){
		this.empName = empName;
		this.empid = empid;
		this.sal = sal;	
	
	}
	public int compareTo(Employee emp){
		return (int)(sal - emp.sal);
	}

}
class CompareDemo{
	public static void main(String []args){
		SortedSet<Employee> s = new TreeSet<Employee>();
		
		s.add(new Employee("Ashish",10,35000.00)); 
		s.add(new Employee("Kanha",43,55000.00)); 
		s.add(new Employee("Rahul",8,75000.00)); 
		s.add(new Employee("Rajesh",5,95000.00)); 
		s.add(new Employee("Badhe",20,45000.00)); 
		
		System.out.println(s);
		//s.descendingSet();
		for(Employee obj : s){
			
			//System.out.print(obj.empid +" ");
			//System.out.println(obj.sal);
			System.out.println(obj.empName);
		}
	}
}
