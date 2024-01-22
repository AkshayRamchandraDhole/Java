class Football{

}

class Cricket{
	
	public static void main(String arsg[]){
	
		Cricket test = new Cricket();
		Cricket ODI = new Cricket();
		Cricket T20 = new Cricket();
		
		boolean res = test instanceof Cricket;
		System.out.println("Test is instanceof Cricket ? : "+res);

		System.out.println("ODI is instanceof Cricekt ? : "+(ODI instanceof Cricket));
		
		System.out.println("T20 is instanceof Cricekt ? : "+(T20 instanceof Cricket));

		// System.out.println(Cricket instanceof Object); : error: cannot find symbol
		
		Cricket T10 = null;
		System.out.println("T10 is instanceof Cricket ? : "+(T10 instanceof Cricket));

		System.out.println("ODI is instanceof Object Class ? : "+(ODI instanceof Object));
		
		System.out.println("T20 is instanceof Object Class ? : "+(T20 instanceof Object));
		
		System.out.println("Test is instanceof Object Class ? : "+(test instanceof Object));

		
		System.out.println("T10 is instanceof Object Class ? : "+(T10 instanceof Object));
		
		// System.out.println("Football is instanceof Cricket ? : "+(Football instanceof Cricket)); // error: cannot find symbol
		

		//System.out.println("Football is instanceof Object Class ? : "+(Football instanceof Object)); error: cannot find symbol

		Football fmatch = new Football();
		System.out.println("fmatch is instanceof Object Class ? : "+(fmatch instanceof Object));
		System.out.println("fmatch is instanceof Football ? : "+(fmatch instanceof Football));

		Football goal = null;
		
		System.out.println("goal is instanceof Object Class ? : "+(goal instanceof Object));
		
		System.out.println("goal is instanceof Football Class ? : "+(goal instanceof Football));
		
	//	System.out.println("goal is instanceof Cricket Class ? : "+(goal instanceof Cricket));	//error: incompatible types: Football cannot be converted to Cricket
		


	}

}
