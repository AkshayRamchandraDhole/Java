class TernaryVoting{

	public static void main(String args[]){

		int user1 = 17 , user2 = 58 ;
		String ans1 , ans2 ;

		ans1 = (user1 > 18) ? "User is Eligible for voting" : "User is not Eligible for Voting" ;
		System.out.println("Age "+ user1 + " " +ans1);
		
		ans2 = (user2 > 18) ? "User is Eligible for voting" : "User is not Eligible for Voting" ;
		System.out.println("Age "+ user2 +" "+ans1);

	}
}
