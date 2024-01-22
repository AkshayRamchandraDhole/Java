import java.util.*;
class Employee{
	
	int empId;
	String name;
	float sal;

	Employee(int empId,String  name,float sal){
		
			this.empId=empId;
			this.name=name;
			this.sal=sal;
	}
	
	void disp(){
			System.out.println(empId+" "+name+" "+sal);
	}

}
class SortBySal implements Comparator<Employee>{

	public int compare(Employee obj1,Employee obj2){
		
		return (int)(obj1.sal-obj2.sal);
	}

}

class SortByName implements Comparator<Employee>{

	public int compare(Employee obj1,Employee obj2){
		
		return (obj1.name.compareTo(obj2.name));
	}

}
class Demo{

	public static void main(String[] args){
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(3,"Kanha",85000));
		al.add(new Employee(1,"Rahul",75000));
		al.add(new Employee(2,"Ashish",95000));
	
		SortBySal sbs = new SortBySal();
		
		Collections.sort(al,sbs);
		
		for(Employee e : al){
			e.disp();
		}
		
		al.add(new Employee(5,"Badhe",90000));
		
		SortByName sbn = new SortByName();
		
		Collections.sort(al,sbn);
		
		for(Employee e : al){
			e.disp();
		}
	}
}
