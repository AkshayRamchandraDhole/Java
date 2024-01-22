class StringBufferDemo{

	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer("Dentist");
	
		//	StringBuffer sb2 = "Rahul";
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer("Pune");
		StringBuffer sb4 = new StringBuffer("Phaltan");
		StringBuffer sb5 = new StringBuffer("Dentist");

		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb4);
		System.out.println(sb5);

		sb2.append("Core2web");
		sb3.append("MH-12");
		sb4.append("MH-11");
		sb5.append("MH-42");
		
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb4);
		System.out.println(sb5);

	}
}
