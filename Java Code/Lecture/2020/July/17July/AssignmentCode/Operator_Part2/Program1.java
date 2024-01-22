class Program1{

	public static void main(String args[]){
	
		int v = 18 ;
		int r = 45 ;
		boolean g ;

		g = v == r ;
		System.out.println("Ans="+g);	// false	
		
		g = v != r ;
		System.out.println("Ans="+g);	// true	
		
		g = v > r ;
		System.out.println("Ans="+g);	// false	
		
		g = v < r ;
		System.out.println("Ans="+g);	// true	
		
		g = v <= r ;
		System.out.println("Ans="+g);	// true	
		
		g = v >= r ;
		System.out.println("Ans="+g);	// false	
	}
}
