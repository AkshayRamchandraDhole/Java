class ConcatString{

	public static void main(String[] args){
	
		String s1 = "Shashi";
		String s2 = new String("Shashi");
		String s3 = "Bagal";
		String s4 = new String("Bagal");

		s1.concat(s3);

		System.out.println(s1); // Shashi
		System.out.println(s3); //  Bagal
		
		System.out.println(s1.concat(s3));  // ShashiBagal
		
	//	s1 = s1.concat(s3);

		System.out.println(s1);  // ShashiBagal
		System.out.println(s3);  // Bagal

		System.out.println(s2.concat(s4)); // ShashiBagal  
		
		System.out.println(s2.concat(s3)); // ShashiBagal  
		
		System.out.println(s1.concat(s4)); // ShashiBagal 

		String s5 = new String();
		s5=s1.concat(s3);
		System.out.println(s5);  // ShashiBagal


	}
}
