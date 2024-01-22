class StringMethodDemo{

	public static void main(String[] args){
	
		System.out.println("Using replace() Method");
		String s1 = new String("Kanhaiya");

		System.out.println(s1); // Kanhaiya

		// replace()

		s1 = s1.replace('a','p');
		
		// s1/replace('a','p');
		//System.out.println(s1); // Kanhaiya
		
		System.out.println(s1); // Kpnhpiyp

		// startsWith()

		System.out.println("Using startsWith() Method");
		
		String s2 = new String("Bielearn");
		String s3 = new String("BieMedia");
		String s4 = new String("CivicGen");

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s2.startsWith("Bie"));  // true
		System.out.println(s3.startsWith("Bie"));  // true
		System.out.println(s4.startsWith("Bie"));  // false
		
		// endsWith()
		System.out.println("Using endsWith() Method");
		
		System.out.println(s2.endsWith("learn"));  // true
		System.out.println(s3.endsWith("dia"));  // true
		System.out.println(s4.endsWith("Bie"));  // false
		
		// indexOf()
		
		System.out.println("Using indexOf() Method");

		String s5 = new String("    BieTickets    ");
		
		System.out.println(s2.indexOf('e'));  // 2
		System.out.println(s2.indexOf('e',3));  // 4
		System.out.println(s2.indexOf("learn"));  // 3
		System.out.println(s2.indexOf("earn",5));  // -1
		System.out.println(s2.indexOf("earn",4));  // 4

		//lastIndexOf()
		
		System.out.println("Using lastIndexOf() Method");
		System.out.println(s2.lastIndexOf('e'));  // 4
		
		//substring()
		
		System.out.println("Using substring() Method");
		System.out.println(s2.substring(3));  // learn
		System.out.println(s2.substring(3,6));  // lea
		
		//toUpperCase()
		
		System.out.println("Using toUpperCase() Method");
		System.out.println(s2.toUpperCase());  // BIELEARN
		
		//toLowerCase()
		System.out.println("Using toLowerCase() Method");
		System.out.println(s2.toLowerCase());  // bielearn
		
		//trim()
		System.out.println("Using trim() Method");
		System.out.println(s5);
		System.out.println(s5.trim());
		
		System.out.println(s5.valueOf());









	}
}
