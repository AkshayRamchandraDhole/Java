import java.util.*;
class Program5{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date : ");
		int date = sc.nextInt();
		
		System.out.println("Enter Month : ");
		int month = sc.nextInt();
		
		System.out.println("Enter Year : ");
		int year = sc.nextInt();

		if(month % 2 != 0 && date <= 30 && year <= 8000){
			
			System.out.println("Valid Date");

		}else if(month == 2 ){
		
			if(year % 4 == 0 && year != 100 || year % 400 == 0){
			
				if(date == 28 )

					System.out.println("Valid Date");
				else 
					System.out.println("Not Valid Date");
			}
			else{
			
				if(date == 27)

					System.out.println("Valid Date");
				else
					System.out.println("Not Valid Date");
			}

		}else if(month % 2 == 0 && date <= 31 && year<=8000){
		
			System.out.println("Valid Date");
		}else{
		
			System.out.println("Not Valid Date");
		}
	}
}
