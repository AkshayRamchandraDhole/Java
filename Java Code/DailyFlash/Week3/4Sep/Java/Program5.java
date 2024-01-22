import java.io.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Date:");
		int iDate=Integer.parseInt(br.readLine());
		System.out.println("Enter Month:");
		int iMonth=Integer.parseInt(br.readLine());
		System.out.println("Enter Year:");
		int iYear = Integer.parseInt(br.readLine());
		switch(iMonth){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(iDate > 31)
					
					System.out.println("Date doesnot exists!!!");
				else
					System.out.println("Date exists!!!");
			break;

			case 4:
			case 6:
			case 9:
			case 11:
				if(iDate > 30)
					
					System.out.println("Date doesnot exists!!!");
				else
					System.out.println("Date exists!!!");
			break;

			case 2:
				if(iDate > 28)
					
					System.out.println("Date doesnot exists!!!");
				else
					System.out.println("Date exists!!!");
			break;
					
		}

	}
}
