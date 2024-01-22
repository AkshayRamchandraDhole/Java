class Cricket{
	static int matchScore = 0 ;
	int noPlayer = 11 ;

	static void disMatchScore(){
	
		System.out.println("Match Score:"+matchScore);
	}
	void disPlayer(){
	
		System.out.println("No of Player Per Side:"+noPlayer);
	}
}

class FootBall{

	static int goalScore = 0 ;
	int noPlayer = 11 ; 
	
	static void disGoalScore(){
	
		System.out.println("GoalScore="+goalScore);
	}
	void disPlayer(){
	
		System.out.println("No of Player Per Side:"+noPlayer);
	}
}

class Games{

	public static void main(String args[]){
	
		Cricket ind = new Cricket();
		ind.matchScore=322;
		ind.disMatchScore();
		ind.disPlayer();
		
		Cricket aus = new Cricket();
		aus.matchScore=300;
		aus.disMatchScore();
		aus.disPlayer();

		FootBall team1 = new FootBall();
		team1.goalScore = 3;
		team1.disGoalScore();
		team1.disPlayer();
		
		FootBall team2 = new FootBall();
		team1.goalScore = 7;
		team1.disGoalScore();
		team1.disPlayer();

	}
}
