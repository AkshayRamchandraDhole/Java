class IPLPlayer{

	String pName = "KL Rahul";
	int runs2020 = 524;
	static int totalRuns = 4563;

	void playerInfo(){
	
		System.out.println("Player Name = "+pName);
		System.out.println("IPL2020Runs = "+runs2020);
		System.out.println("Total Runs = "+totalRuns);
	}

	public static void main(String[] args){
	
		IPLPlayer info = new IPLPlayer();
		info.playerInfo();
		
		System.out.println("Player Name = "+info.pName);
		System.out.println("IPL2020Runs = "+info.runs2020);
		System.out.println("Total Runs = "+totalRuns);
	

	}
}
