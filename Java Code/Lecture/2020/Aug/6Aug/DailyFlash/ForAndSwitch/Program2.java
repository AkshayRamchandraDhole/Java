import java.util.*;
class MarksYear{

	public static void main(String args[]){
	
		System.out.println("Enter Student Year(0-3):");
		Scanner sc = new Scanner(System.in);
		int iYr = sc.nextInt();
		switch(iYr){

			case 0:
				System.out.println("1st Year Students are not eligible for Education Scholarship..");
			break;
			case 2:
				System.out.println("3rd Year Students are not eligible for Education Scholarship..");
			break;
			case 1:
				System.out.println("Enter Student Marks(0-99):");
				int iMr = sc.nextInt();
				switch(iMr){
				
					case 80:
						System.out.println("2nd Year Students are eligible for Education Scholarship..");
					break;
				}
			break;

			
			case 3:
				System.out.println("4th Year Students are not eligible for Education Scholarship..");
			break;

			default :
				System.out.println("Please enter correct choice..");
			break;

		}
	}
}
