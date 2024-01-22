class Cricket{

	void match(String st1,String st2){
	
		System.out.println(st1+" Vs "+st2);
	}
	int match(String st1,String st2,int mno){
	
		System.out.println(st1+" Vs "+st2+" Match "+mno);
		return mno;
	}
	float match(String st1,String st2,float run){
	
		System.out.println(st1+" Vs "+st2+" Run "+run);
		return run;
	}
	long match(String st1,String st2,long score){
	
		System.out.println(st1+" vs "+st2);
		return score;
	}

	public static void main(String[] args){
	
		Cricket c = new Cricket();
		c.match("Ind","Aus");
		c.match("Pak","Nz",1);
		c.match("PRS","MLS",158.00f);
		c.match("HBH","ADS",135l);

	}
}
