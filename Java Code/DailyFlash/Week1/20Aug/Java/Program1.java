import java.util.Scanner;
class Program1{

	public static void main(String args[]){
	
		System.out.println("Enter Side1,Side2 and Hypotenuse:");
		Scanner sc = new Scanner(System.in);
		int iSide1 = sc.nextInt();
		int iSide2 = sc.nextInt();
		int iHypo = sc.nextInt();

		int iSide = iSide1 * iSide1 + iSide2 * iSide2;
		int iHy = iHypo * iHypo;
		if(iSide == iHy)
			System.out.println("Triangle Satisfies the Pythagorean Theorem..");
		else

			System.out.println("Triangle Not Satisfies the Pythagorean Theorem..");
	}
}
