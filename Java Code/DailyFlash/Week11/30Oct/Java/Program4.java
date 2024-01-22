class Program4{

	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer("Healthy");
		System.out.println("Before Operation : "+sb1);
		sb1.insert(4," ");
		System.out.println("After insert method : "+sb1);
		sb1.insert(8,"self");
		System.out.println("After insert method : "+sb1);
		sb1.deleteCharAt(4);
		System.out.println("After deletecharAt method : "+sb1);
	}
}
