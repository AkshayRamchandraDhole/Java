import java.util.*;
class NumDays{

	public static void main(String args[]){
	
		System.out.println("Enter Month Number(0-11)");
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		switch(iNum){
		
			case 0:
				System.out.println("Jan has 31 Days");
			break;
			case 1:
				System.out.println("Feb has 28 Days");
			break;
			case 2:
				System.out.println("Mar has 31 Days");
			break;
			case 3:
				System.out.println("Apr has 30 Days");
			break;
			case 4:
				System.out.println("May has 31 Days");
			break;
			case 5:
				System.out.println("Jun has 30 Days");
			break;
			case 6:
				System.out.println("Jul has 31 Days");
			break;
			case 7:
				System.out.println("Aug has 31 Days");
			break;
			case 8:
				System.out.println("Sep has 30 Days");
			break;
			case 9:
				System.out.println("Oct has 31 Days");
			break;
			case 10:
				System.out.println("Nov has 30 Days");
			break;
			case 11:
				System.out.println("Dec has 31 Days");
			break;
			default:
				System.out.println("Please enter correct choice");
			break;

		}

	
	
	}
}
