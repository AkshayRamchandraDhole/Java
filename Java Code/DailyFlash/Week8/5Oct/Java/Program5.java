import java.io.*;
class Program5{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Length of Array:");
		int len = Integer.parseInt(br.readLine());
		int[] arr1 = new int[len];
		System.out.println("Enter Element in First Array:");
		for(int i=0;i<arr1.length;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Reverse Array is :");
		for(int i=arr1.length-1;i>=0;i--){
		
			System.out.println(arr1[i]);
		}
	
		
	}
}
