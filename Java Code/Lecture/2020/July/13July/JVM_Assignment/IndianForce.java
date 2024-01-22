class IndianArmy{
	
	static int gun_Count=2000000;
	int tank_Count=0;

	void getTkCt(){
	
		System.out.println("Tank Count in J&K:"+tank_Count);
	}

	static void getGnCt(){
	
		System.out.println("Total Gun in India:"+gun_Count);
	}
}
class IndianNavy{

	static int navy_Count_World=7;
	int personnel_Count=0;

	void getPlCt(){
	
		System.out.println("Mumbai Navy Personnel Count:"+personnel_Count);
	}

	static void getRank(){
	
		System.out.println("India Navy Rank in World:"+navy_Count_World);
	}

}

class IndianAirForce{

	 static int MIG21_Count=0;
        int helicopter_Count=0;

	void getHeliCt(){
	
	
		System.out.println("HeliCopter from Russia Count:"+helicopter_Count);
	}

	static void getMIG21Ct(){
	
		System.out.println("MIG21 from Russia Count:"+MIG21_Count);
	}

	public static void main(String args[]){
	
		IndianArmy JK = new IndianArmy();
		JK.tank_Count=70;
		JK.getTkCt();
		JK.getGnCt();

		IndianNavy Mumbai = new IndianNavy();
		Mumbai.personnel_Count=2500;
		Mumbai.getPlCt();
		Mumbai.getRank();

		IndianAirForce Russia = new IndianAirForce();
		Russia.MIG21_Count=12;
		Russia.helicopter_Count=130;
		Russia.getHeliCt();
		Russia.getMIG21Ct();

	}


}
