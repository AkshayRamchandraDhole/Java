import java.util.*;
class ReadRTO{

	public static void main(String args[]){
	
		System.out.println("Enter RTO Code(AP,MH,UP,MP,GA):");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();

		switch(st){
		
			case "AP":
				System.out.println("State Name: "+st+" Andra-Pradesh");
				break;
			case "MH":
				System.out.println("State Name: "+st+" Maharashtra");
				break;
			case "UP":
				System.out.println("State Name: "+st+" Uttar-Pradesh");
				break;
			case "MP":
				System.out.println("State Name: "+st+" Madha-Pradesh");
				break;
			case "GA":
				System.out.println("State Name: "+st+" Goa");
				break;

			default:
				System.out.println("Please enter given option...");
				break;

		}
	}
}
