import java.io.*;
class ReadChar{

	public static void main(String args[]) throws IOException{
	
		System.out.println("Enter Character(J,P,C,A,F):");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch = (char)br.read();

		switch(ch){
		
			case 'J':
				System.out.println("Java Programming");
				break;
			case 'P':
				System.out.println("Python Programming");
				break;
			case 'C':
				System.out.println("C Programming");
				break;
			case 'A':
				System.out.println("Android Programming");
				break;
			case 'F':
				System.out.println("Flutter Programming");
				break;
			default:
				System.out.println("Please enter given option..");
				break;
		}


	}
}
