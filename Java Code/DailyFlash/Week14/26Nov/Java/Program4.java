class Core2web{

	int noOfMember=17;
	int student=2500;
}
class Biencaps extends Core2web{

	int noOfEmp=29;
	String prodName="Core2web App";

	void show(){
	
		System.out.println("No of Member in Core2web : "+noOfMember);
		System.out.println("No of Students in Core2web : "+student);
		System.out.println("No of Employee in Biencaps : "+noOfEmp);
		System.out.println("Peoduct make by Biencaps : "+prodName);
	}

	public static void main(String[] args){
	
		Biencaps bi = new Biencaps();
		bi.show();
	}

}
