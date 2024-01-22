class Program3{

	public static void main(String args[]){
	
		int num1 = 188 , num2 = 255 , num3 = -108 , num4 = -123 ;
		int res1 = 0 , res2 = 0 , res3 = 0 , res4 = 0 ;

		res1 = num1 >>> 4 ;
		System.out.println("Res1 = "+res1);
		
		// res2 = num2 <<< 3 ; 		i) it shows an many error because unsigned left shift (<<<) as operator not present in java
		
		// System.out.println("Res2 = "+res2);
		
		res3 = num3 >>> 23 ;
		System.out.println("Res3 = "+res3);
		
		// res4 = num4 <<< 15 ;		  i) it shows an many error because unsigned left shift (<<<) as operator not present in java

		// System.out.println("Res4 = "+res4);
		
	}
}
