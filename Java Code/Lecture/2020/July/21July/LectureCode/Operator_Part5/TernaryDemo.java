class Ternary{

	public static void main(String args[]){
	
		int x = 25 ;
		int y = 20 ;
		int res = 0 ;

		// (x < y) ? x : y ; //error: not a statement
		
		System.out.println((x < y) ? x : y);	// 20

		res = (x > y) ? x : y ;
		System.out.println(res);	// 25

//		(x < y) ? System.out.println("x is greater") : System.out.println("y is small");	// error: not a statement
		
//		res = (x < y ) ? System.out.println("x is greater") : System.out.println("y is small"); 	 error: incompatible types: bad type in conditional expression

	       String ans;
       			       
	//	ans = (x < y ) ? System.out.println("x is greater") : System.out.println("y is small");  error: incompatible types: bad type in conditional expression

		
		ans = (x < y ) ? "x is greater" : "y is small" ; 
		System.out.println(ans);

		int z = 22 ;
		int ans1 = 0;
		ans1 = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z) ;
		System.out.println(ans1); // 25


		ans1 = (x < y) ? ((x > z) ? x : z) : ((y < z ) ? y : z) ;
		System.out.println(ans1);	// 20
		

		ans1 = (x < y) ? ((x > z) ? x : z) : ((y < z) ? y : z) ;
		System.out.println(ans1);	// 22


		ans1 = (x < y) ? ((x < z) ? x : z) : ((y > z) ? y : z) ;
		System.out.println(ans1);	// 22


		ans1 = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z) ;
		System.out.println(ans1);	// 25


		ans1 = (x < y) ? ((x > z) ? x : z) : ((y < z) ? y : z) ;
		System.out.println(ans1);	// 20

	}
}
