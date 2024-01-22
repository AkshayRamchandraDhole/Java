class StringBufferMethod{

	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer();
		
		StringBuffer sb2 = new StringBuffer("Shashi");
		
		// capacity()
		
		System.out.println("Using capaciy() method");
		System.out.println(sb1.capacity()); // 16 
		System.out.println(sb2.capacity()); // 22

		//length()
		
		System.out.println("Using length() method");
		System.out.println(sb1.length()); // 0
		System.out.println(sb2.length()); // 6
		
		//append()
		
		System.out.println("Using append() method");
		sb2.append("Bagal");
		System.out.println(sb2); // ShashiBagal
		
		sb2.append(28);
		System.out.println(sb2); // ShashiBagal28
		
		StringBuffer sb3 = new StringBuffer("Biencaps");
		sb2.append(sb3);
		System.out.println(sb2); // ShashiBagal28Biencaps

		//insert()
		
		System.out.println("Using insert() method");
		sb2.insert(13,"Core2web");
		//sb2.insert(13,true);
		//sb2.insert(13,'A');
		//sb2.insert(13,19.0f);
		//sb2.insert(19.0);
		//sb2.insert(13,19.0);
		System.out.println(sb2); // ShashiBagal28Core2webBiencaps

		//deleteCharAt()

		System.out.println("Using deleteCharAt() method");
		sb2.deleteCharAt(11);
		System.out.println(sb2); // ShashiBagal8Core2webBiencaps

		//delete()
		
		System.out.println("Using delete() method");
		sb2.delete(6,11);
		System.out.println(sb2); // Shashi8Core2webBiencaps
		
		//reverse()
	
		System.out.println("Using reverse() method");
		sb2.reverse();
		System.out.println(sb2); //spacneiBbew2eroC8ihsahS 
		sb2.reverse();
		
		//setLength()
	
		System.out.println("Using setLength() method");
		//sb2.setLength(6);
		System.out.println(sb2); //Shashi	
		
		//trimToSize()
	
		System.out.println("Using trimToSize() method");
		//System.out.println(sb2.capacity()); //46
		//sb2.trimToSize();
		//System.out.println(sb2.capacity()); // 23	
		System.out.println(sb2); // Shashi8Core2webBiencaps	
		//System.out.println(sb2.capacity()); // 23
	
		// charAt()

		System.out.println("Using charAt() method");
		System.out.println(sb3.charAt(2)); // e	
		
		// codePointAt()

		System.out.println("Using codePointAt() method");
		System.out.println(sb3.codePointAt(2)); // 101	
		
		// codePointBefore()

		System.out.println("Using codePointAt() method");
		System.out.println(sb3.codePointBefore(2)); // 105	
		
		// codePointCount()

		System.out.println("Using codePointCount() method");
		System.out.println(sb3.codePointCount(2,6)); // 4	
		
		// replace()

		System.out.println("Using replace() method");
		System.out.println(sb3.replace(1,3,"Akshay")); // BAkshayncaps
		
		// substring()

		System.out.println("Using replace() method");
		System.out.println(sb3.substring(1)); // BAkshayncaps
		

		
	}
}
