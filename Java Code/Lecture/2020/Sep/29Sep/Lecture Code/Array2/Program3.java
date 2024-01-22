import java.io.*;
class UserInput{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array : ");
		int len = Integer.parseInt(br.readLine());

		int[] iarr = new int[len];

		for(int i=0;i<iarr.length;i++){
			System.out.println("Enter Array Element:");
			iarr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Element of Array is : ");
		for(int i=0;i<iarr.length;i++)
			System.out.println(iarr[i]);

	}
}
