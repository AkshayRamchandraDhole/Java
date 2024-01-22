import java.util.Scanner;
class PrimeRange{

	public static void main(String args[]){
		System.out.println("Enter range of prime number:");
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		for(int i=1;i<=iNum;i++){
			int count=0;
			for(int j=1;j<=i;j++){
			if(i%j==0){
				count++;
			}
			}
			if(count==2){
			
				System.out.println("Prime Number is:"+i);
			}
		}
	}
}
