class Student{

	Student(){
	
		System.out.println("Unknown");
	}
	Student(String str){
	
		System.out.println("Name : "+str);
	}

	public static void main(String[] args){
	
		Student s = new Student("Akshay");
	}
}
