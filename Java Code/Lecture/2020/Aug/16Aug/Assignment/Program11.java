import java.util.Scanner;
class Program11{

	public static void main(String args[]){
	
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		System.out.println("Num="+iNum);
		System.out.println("Perfect Divisior:");
		for(int i=1;i<iNum;i++){
		
			if(iNum%i==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
