class Program2{

	public static void main(String args[]){
	
		int a = 10 ;
		int b;

		b = a >>>= 2;
		System.out.println("B="+b); 
		
		b = a <<= 3;
		System.out.println("B="+b);  
		
		b = a ^= 2;
		System.out.println("B="+b); 
		
		a = ++a;
		System.out.println("A="+a); // 19 
		
		a = -a;
		System.out.println("A="+a); // -19
	}
}
