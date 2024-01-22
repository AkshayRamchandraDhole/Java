import java.util.Scanner;
class FactRange{

	public static void main(String args[]){
		System.out.println("Enter range of factorial number:");
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		int fact=1;
		for(int i=1;i<=iNum;i++){

			fact=fact*i;
			System.out.println("Factorial of "+i+" is:"+fact);
			
		}
	}
}
