import java.io.*;
class Program5{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array : ");
		int len = Integer.parseInt(br.readLine());
		if(len % 2 ==0)
			System.out.println("Please Enter Odd Length..");
		else {

				int[] arr1 = new int[len];
				int[] arr2 = new int[len];
				for(int i=0;i<len;i++){
					
					System.out.println("Enter Array1 Element:");
					int ele = Integer.parseInt(br.readLine());
					arr1[i] = ele;
					arr2[i] = 0 ;
			
					if(arr1[i] % 2 == 0)
					arr2[i] = -1;
			}

			System.out.println("First Array :");
			for(int i=0;i<arr1.length;i++){
				System.out.println(arr1[i]);
			}

			System.out.println("Second Array :");
			for(int i=0;i<arr2.length;i++){
				System.out.println(arr2[i]);
			}

		}
	}
}
