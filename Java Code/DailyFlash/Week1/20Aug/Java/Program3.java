class Program3{

	public static void main(String args[]){
	
		int iYear=1998;
		if(iYear%4==0 && iYear % 100 !=0 || iYear % 400 == 0)
			System.out.println(iYear+" is Leap Year...");
		else
			System.out.println(iYear+" is Not a Leap Year...");
	}
}
