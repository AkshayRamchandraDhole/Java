import java.io.*;
class Program2{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array : ");
		int len = Integer.parseInt(br.readLine());
		int[] arr1 = new int[len];
		int sum=0;
		for(int i=0;i<len;i++){
		
			System.out.println("Enter Array Element:");
			int ele = Integer.parseInt(br.readLine());
			arr1[i] = ele;
			sum+=arr1[i];
		}
		System.out.println("Element of Array is: ");
		for(int i=0;i<arr1.length;i++){
		
			System.out.println(arr1[i]);
		}

		System.out.println("Sum of Array is : "+sum);
		
	}
}
