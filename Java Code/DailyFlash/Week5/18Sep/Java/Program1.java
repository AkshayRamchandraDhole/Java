import java.io.*;
class Program1{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which value do you want enter if String enter(1) else Int enter(2) value:");
		int Ich=Integer.parseInt(br.readLine());
		switch(Ich){
		
			case 1 :
				System.out.println("Enter String:");
				String st=br.readLine();
				System.out.println(st);
			break;
			case 2 :
				System.out.println("Enter Intger Value:");
				int iNum = Integer.parseInt(br.readLine());
				System.out.println(iNum);
			break;
			default:
				System.out.println("Please Enter Correct Choice....");
			break;
		}


	}
}
