class Try2{

	public static void main(String args[]){
	
		byte b=-10;
		//b=11;
		//b++; // -9
		 b--; // -11 
		System.out.println("Byte="+b);

		int i=5555;
		i+=1.5;
		System.out.println("Int I="+i);

		char a='A';
		a+=2.0;
		System.out.println("A="+a);

		float f=10.5f;
		f+=1.5;
		System.out.println("F="+f);
		
		double d=10.5;
		d+=1.5;
		System.out.println("D="+d);


	/*	float i=5555f;  error: variable i is already defined in method main(String[])
									float i=5555f;
		      							      ^ 
		i+=1.5;
		System.out.println("F="+i);
	*/
	}
}
