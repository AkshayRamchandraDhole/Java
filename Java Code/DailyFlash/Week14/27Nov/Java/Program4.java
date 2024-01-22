class IndvsAusMatch{

	void fielding(String st){
	
		System.out.println("Now ball is going to "+st+" fielder");
	}
	void fielding(String st1,String st2){
	
		System.out.println("Now fielder "+st1+" throwing ball to fielder "+st2);
	}
	void fielding(String ... varargs){
	
		System.out.println("Now ball is moving between the many fielder ");
	}

}
class Match{

	public static void main(String[] args){
	
		IndvsAusMatch iam = new IndvsAusMatch();
		iam.fielding("Bumrah");
		iam.fielding("Jadeja","Kohli");
		iam.fielding("Hardik","Kohli","Rahul");
	}
}
