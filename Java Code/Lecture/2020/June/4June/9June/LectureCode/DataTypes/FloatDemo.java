class FloatDemo{

	public static void main(String args[]){
	
	/*	float f;
		System.out.println(f);

		error: variable f might not have been initialized
	
		float f=10.0;
		System.out.println(f);

		 error: incompatible types: possible lossy conversion from double to float
	*/
		float f=25.6f;
		System.out.println(f); // 25.6

		double d=25.6;
		System.out.println(d); // 25.6

		if(f==d)
			System.out.println("Same Value...");
		else
			System.out.println("Different Value...");
	
	}
}
