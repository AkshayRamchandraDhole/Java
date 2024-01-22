class Program1{

	public static void main(String args[]){
	
		//	Logical AND(&) on Int

		//	Logical Operator can not perform on float double because it return int.
		
		System.out.println(".....Logical AND.....");
		
		System.out.println();
		
		int v = 18 ;
		int r = 45 ;
		int ans1 = 0 ;
		ans1 = v & r ;
	       System.out.println("Int Logical AND Ans1="+ans1);
		
	       //	Logical AND(&) on Byte
	       	/*
		 * i) When we perform a Logical AND On Byte it show an (error: incompatible types: possible lossy conversion from int to byte)
		 *  
		 *  ii) Solution is that when  store the element i use int rather than byte  
 
		 * */
	       	byte s = 18 ;
		byte j = 45 ;
		int ans2 = 0 ;
		ans2 = s & j ;
	       System.out.println("Byte Logical AND Ans2="+ans2);

	       // Logical AND(&) on Short
	       /*
		*
		*	i) When we perform a Logical AND On Short it show an error: incompatible types: possible lossy conversion from int to short
		* 
		* 	ii) Solution is that when  store the element i use int rather than short  
		* */
		short a = 18 ;
		short b = 45 ;
		int ans3 = 0 ;
		ans3 = a & b ;
	       System.out.println("Short Logical AND Ans3="+ans3);

	       // Logical AND(&) on Long
	       /**/


		long c = 18 ;
		long d = 45 ;
		long ans4 = 0 ;
		ans4 = c & d ;
	       System.out.println("Long Logical AND Ans4="+ans4);
		
	       /*	 error: bad operand types for binary operator '&'

		*
		float e = 18.0f ;
		float f = 45.0f ;
		float ans5 = 0.0f ;
		ans5  = e & f ;
	       System.out.println("Float Logical AND Ans5="+ans5);
	
	       error: bad operand types for binary operator '&'

		double g = 18.0 ;
		double h = 45.0 ;
		double ans5 = 0.0 ;
		ans5  = g & h ;
	       System.out.println("Double Logical AND Ans5="+ans5);
*/		
	       //Logical AND(&) on Char
	       // i) When we perform a Logical AND On char it show an error: incompatible types: possible lossy conversion from int to char
                
                //       ii) Solution is that when  store the element i use int rather than char

	       char i = 'a';
	       char l = 'b';
	       int k = 0;
	       k = i & j ;
	       System.out.println("Char Logical AND:"+k);
		
	       System.out.println();
	       System.out.println("......Logical OR....");
	       System.out.println();
		
		// 	Logical OR(|) on Int
	        
	       	int m = 24 ;
                int n = 10 ;
                int ans5 = 0 ;
                ans5 = m | n ;
               System.out.println("Int Logical OR Ans5="+ans5);


               //       Logical AND(|) on Byte
                 /*
                 * i) When we perform a Logical AND On Byte it show an (error: incompatible types: possible lossy conversion from int to byte)
                 *  
                 *  ii) Solution is that when  store the element i use int rather than byte  
 
                 * */

                byte o = 24 ;
                byte p = 10 ;
                int ans6 = 0 ;
                ans6 = o | p ;
               System.out.println("Byte Logical OR Ans6="+ans6);

               // Logical AND(&) on Short
               /*
                *
                *       i) When we perform a Logical AND On Short it show an error: incompatible types: possible lossy conversion from int to short
                *
                *       ii) Solution is that when  store the element i use int rather than short
                * */
                short q = 24 ;
                short t = 10 ;
                int ans7 = 0 ;
                ans7 = q | t ;
               System.out.println("Short Logical OR Ans7="+ans7);

               // Logical AND(&) on Long
               /**/


                long u = 24 ;
                long w = 10 ;
                long ans8 = 0 ;
                ans8 = u | w ;
               System.out.println("Long Logical OR Ans8="+ans8);


	         //      error: bad operand types for binary operator '|'

                
           /*     float a1 = 24.0f ;
                float a2 = 10.0f ;
                float ans9 = 0.0f ;
                ans9  = a1 | a2 ;
               System.out.println("Float Logical OR Ans9="+ans9);
        
              // error: bad operand types for binary operator '|'

                double a3 = 24.0 ;
                double a4 = 10.0 ;
                double ans10 = 0.0 ;
                ans10  = a3 | a4 ;
               System.out.println("Double Logical OR Ans10="+ans10);

               //Logical AND(&) on Char
               // i) When we perform a Logical OR On char it show an error: incompatible types: possible lossy conversion from int to char

                //       ii) Solution is that when  store the element i use int rather than char
*/
               char a5 = 'a';
               char a6 = 'b';
               int ans11 = 0;
               ans11 = a5 | a6 ;
               System.out.println("Char Logical OR:"+ans11);

               System.out.println();
               System.out.println("......Logical EX-OR....");
               System.out.println();

	       //      Logical EXOR(^) on Int

                int m1 = 9 ;
                int n2 = 10 ;
                int ans9 = 0 ;
                ans9 = m1 ^ n2 ;
               System.out.println("Int Logical EXOR Ans9="+ans9);
	                      //       Logical AND(|) on Byte
                 /*
                 * i) When we perform a Logical AND On Byte it show an (error: incompatible types: possible lossy conversion from int to byte)
                 *  
                 *  ii) Solution is that when  store the element i use int rather than byte  
 
                 * */

                byte o1 = 9 ;
                byte p2 = 10 ;
                int ans10 = 0 ;
                ans10 = o1 ^ p2 ;
               System.out.println("Byte Logical EXOR Ans10="+ans10);

	         // Logical AND(&) on Short
               /*
                *
                *       i) When we perform a Logical AND On Short it show an error: incompatible types: possible lossy conversion from int to short
                *
                *       ii) Solution is that when  store the element i use int rather than short
                * */
                short q1 = 9 ;
                short t1 = 10 ;
                int ans12 = 0 ;
                ans12 = q1 ^ t1 ;
               System.out.println("Short Logical EXOR Ans12="+ans12);

		               // Logical AND(&) on Long
               /**/


                long u1 = 9 ;
                long w1 = 10 ;
                long ans13 = 0 ;
                ans13 = u1 ^ w1 ;
               System.out.println("Long Logical EXOR Ans13="+ans13);

	        //      error: bad operand types for binary operator '|'


  /*              float a11 = 9.0f ;
                float a21 = 10.0f ;
                float ans14 = 0.0f ;
                ans14  = a11 ^ a21 ;
               System.out.println("Float Logical EXOR Ans14="+ans14);

	       // error: bad operand types for binary operator '|'

                double a31 = 9.0 ;
                double a41 = 10.0 ;
                double ans15 = 0.0 ;
                ans15  = a31 ^ a41 ;
               System.out.println("Double Logical EXOR Ans15="+ans15);
	      */

	           //Logical AND(&) on Char
               // i) When we perform a Logical OR On char it show an error: incompatible types: possible lossy conversion from int to char

                //       ii) Solution is that when  store the element i use int rather than char

               char a51 = 'a';
               char a61 = 'b';
               int ans14 = 0;
               ans14 = a51 ^ a61 ;
               System.out.println("Char Logical EXOR:"+ans14);


	}
}

