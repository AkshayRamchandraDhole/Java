import java.util.Scanner;
class HelloWorld{
	
		static String sName;
                static int imob;
                static char cg;
                static float fPercentage;
                static double dAttendence;
                static boolean bfail;
                static byte bage;
                static short sRollNo;
                static long lPRNNO;


	public static void main(String args[]){
	
		System.out.println("Welcome to Scanner Demo...");
		Scanner sc = new Scanner(System.in);

	/*	String sName;
		int imob;
		char cg;
		float fPercentage;
		double dAttendence;
		boolean bfail;
		byte bage;
		short sRollNo;
		long lPRNNO;
		

	/*	System.out.println("Enter Name:");
		//sName=sc.next(); //Read a String only if give white-space then it take but store before white-space and after white-space is check to another  
		sName=sc.nextLine(); // overcome the drawback of next() this method introduce

		System.out.println("Enter MobNo:");
		imob=sc.nextInt();

		System.out.println("Gender:");
		cg = sc.next().charAt(0);
		
		System.out.println("Enter Percentage:");
		fPercentage=sc.nextFloat();


		System.out.println("Enter Attendence:");
		dAttendence = sc.nextDouble();

		System.out.println("Enter Result:");
                bfail = sc.nextBoolean();

		System.out.println("Enter Age:");
                bage = sc.nextByte();

		System.out.println("Enter RollNo:");
                sRollNo = sc.nextShort();

		System.out.println("Enter PRNNO:");
                lPRNNO = sc.nextLong(); */


		System.out.println("\nName:"+sName);
		System.out.println("MobNo:"+imob);
		System.out.println("Gender:"+cg);
		System.out.println("Percentage:"+fPercentage);
		System.out.println("Attendence:"+dAttendence);
		System.out.println("Result:"+bfail);
		System.out.println("Age:"+bage);
		System.out.println("RolNo:"+sRollNo);
		System.out.println("PRNNO:"+lPRNNO);

		

	}
}
