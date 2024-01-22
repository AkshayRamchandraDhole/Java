class Program5{

	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer("Aquaman");
		System.out.println("Before Operation : "+sb1);
		sb1.delete(4,7);
		System.out.println("After delete method : "+sb1);
	}
}
