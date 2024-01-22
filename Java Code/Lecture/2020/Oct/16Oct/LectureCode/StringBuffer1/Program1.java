class StringBufferDemo{

	public static void main(String[] args){
	
		System.out.println("Using First Construector StringBuffer()"); 	
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1); 		// empty
		System.out.println(sb1.capacity()); // 16

		sb1.append("Core2web");
		System.out.println(sb1); 		// Core2web
		System.out.println(sb1.capacity()); // 16
		
		sb1.append("Technologies");
		System.out.println(sb1); 		// Core2webTechnologies
		System.out.println(sb1.capacity()); // 34

		System.out.println("Using Second Construector StringBuffer(String str)"); 	
		
		StringBuffer sb2 = new StringBuffer("Shashi");
		System.out.println(sb2); 		// Shashi
		System.out.println(sb2.capacity()); // 22
		
		sb2.append("Core2web");
		System.out.println(sb2); 		// Core2web
		System.out.println(sb2.capacity()); // 16
		
		sb2.append("Biencaps");
		System.out.println(sb2); 		// Core2web
		System.out.println(sb2.capacity()); // 16
		
		sb2.append("BieMedia");
		System.out.println(sb2); 		// Core2web
		System.out.println(sb2.capacity()); // 16

		System.out.println("Using Third Construector StringBuffer(int p1)"); 	
		
		StringBuffer sb3 = new StringBuffer(500);
		System.out.println(sb3); 		// Core2web
		System.out.println(sb3.capacity()); // 16
		
		System.out.println("Using hashCode()");
		System.out.println(sb1.hashCode()); // 16
		System.out.println(sb2.hashCode()); // 16
		System.out.println(sb3.hashCode()); // 16
		
		System.out.println("Using identityHashCode()");
		System.out.println(System.identityHashCode(sb1)); // 16
		System.out.println(System.identityHashCode(sb2)); // 16
		System.out.println(System.identityHashCode(sb3)); // 16


	}
}
