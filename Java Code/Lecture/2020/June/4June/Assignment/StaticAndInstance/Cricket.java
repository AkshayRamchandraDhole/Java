class Cricket{

	int bat=11;
	static int rules=1;
	int bowl=5;

	void bowling(){
	
		System.out.println("Bowling....");
	}

	void batting(){
	
		System.out.println("Batting...");
	}

	static void liveStream(){
	
		System.out.println("Live Streaming...");
	}

	static void scorecard(){
	
		System.out.println("Match Score...");
	}
}


class Player{

	public static void main(String args[]){
	
		Cricket c = new Cricket();

		c.bowling(); // Bowling....

		//liveStream(); //  Error :  Can not find symbol
		
		c.liveStream(); // Live Streaming...

		Cricket.liveStream(); // Live Streaming...

		c.batting(); // Batting...

		Cricket.scorecard(); // Match Score...
	}
}
