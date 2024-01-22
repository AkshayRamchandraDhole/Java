import java.io.*;
class Program1{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array : ");
		int len = Integer.parseInt(br.readLine());
		int[] arr1 = new int[len];
		for(int i=0;i<len;i++){
		
			System.out.println("Enter Array Element:");
			int ele = Integer.parseInt(br.readLine());
			arr1[i] = ele;
		}
		System.out.println("Element of Array is: ");
		for(int i=0;i<arr1.length;i++){
		
			System.out.println(arr1[i]);
		}

		System.out.println("Reverse Array is : ");
		for(int i=arr1.length-1;i>=0;i--){
		
			System.out.println(arr1[i]);
		}
		
	}
}
