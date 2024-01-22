class WeekDay{

	public static void main(String args[]){
	
		int x = 2 ;
		switch(x){
		
			case 0 :
				{
				
					System.out.println("Sunday..");
					break;					
				}
			case 1 :
				System.out.println("Monday..");
				break;
			case 2 :
				System.out.println("Tuesday..");
				break;
			case 3 :
				System.out.println("Wenesday..");
				break;
			case 4 :
				System.out.println("Thursday..");
				break;
			case 5 :
				System.out.println("Friday..");
				break;
			case 6 :
				System.out.println("Saturday..");
				break;
			default :
				System.out.println("Please Enter Day Between 0 to 6...");
				break;
		}
	}
}
