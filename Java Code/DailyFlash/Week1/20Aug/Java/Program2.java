import java.util.Scanner;
class Program2{

	public static void main(String args[]){
	
		System.out.println("Enter P,N and R for Simple Interest:");
		Scanner sc = new Scanner(System.in);
		int iP = sc.nextInt();
		int iN = sc.nextInt();
		int iR = sc.nextInt();

		int iSI = (iP*iN*iR)/100;
		System.out.println("Simple Interest:"+iSI);
	}
}
