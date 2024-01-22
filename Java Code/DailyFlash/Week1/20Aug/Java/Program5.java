import java.util.Scanner;
class Program5{

	public static void main(String args[]){
	
		System.out.println("Enter Five Subject Marks Out of 100:");
		Scanner sc = new Scanner(System.in);
		int iSub1 = sc.nextInt();
		int iSub2 = sc.nextInt();
		int iSub3 = sc.nextInt();
		int iSub4 = sc.nextInt();
		int iSub5 = sc.nextInt();

		float iPercen = iSub1+iSub2+iSub3+iSub4+iSub5;
		iPercen = iPercen / 500;
		iPercen = iPercen * 100;
		System.out.println("Percentages:"+iPercen);
		if(iPercen >= 90)
			System.out.println("Grade A");
		else if(iPercen >= 80)
			System.out.println("Grade B");
		else if(iPercen >= 70)
			System.out.println("Grade C");
		else if(iPercen >= 60)
			System.out.println("Grade D");
		else if(iPercen >= 40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}
