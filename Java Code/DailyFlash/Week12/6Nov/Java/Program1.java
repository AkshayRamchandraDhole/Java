class Student{

	Student(){
	
		System.out.println("Unknown");
	}
	Student(String str){
	
		System.out.println("Name : "+str);

	}
	public static void main(String[] args){
	
		Student s1 = new Student();
		Student s2 = new Student("Akshay");
	}
}
