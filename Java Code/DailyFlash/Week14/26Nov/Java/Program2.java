class Library{

	int noOfBook=100;
	String nm="SK Library";
	int fee=700;
}
class Book extends Library{

	void info(){
	
		System.out.println("No of Book = "+noOfBook);
		System.out.println("Name = "+nm);
		System.out.println("Fee = "+fee);
	}

	public static void main(String[] args){
	
		Book b = new Book();
		b.info();
	}
}
