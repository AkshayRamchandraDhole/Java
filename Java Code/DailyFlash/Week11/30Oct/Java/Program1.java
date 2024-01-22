class Program1{

	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Length : "+sb1.length());
		System.out.println("Capacity : "+sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("Core2web");
		System.out.println("Length : "+sb2.length());
		System.out.println("Capacity : "+sb2.capacity());
	}
}
