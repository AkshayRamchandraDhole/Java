class StringDemo1{

	public static void main(String[] args){
	
		String s1="Core2web";  // SCP
		String s2=new String("Core2web");  // Heap-ref SCP
		String s3="Core2web";  // SCP
		String s4=new String("Core2web");  // heap-ref SCP
		String s5 = new String("Biencaps"); // heap-ref SCP
		String s6 = "Biencaps"; // SCP

	
		System.out.println(s5);
		System.out.println(s6);

		System.out.println(s5 == s6 ); //false
		
		s5 = s5.intern();
		System.out.println(s5 == s6 ); 



	}
}
