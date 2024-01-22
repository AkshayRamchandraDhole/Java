class Program1{

	public static void main(String args[]){
	
		int yr=2020;
		System.out.println("Year is:"+yr);
		if(yr%4==0 && yr%100!=0 || yr%400==0)
			System.out.println("Leap Year..");
		else
			System.out.println("Not Leap Year...");
	}
}
