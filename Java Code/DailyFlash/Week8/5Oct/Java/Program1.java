import java.io.*;
class Program1{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Length of Array:");
		int len = Integer.parseInt(br.readLine());
		int[] arr1 = new int[len];
		int[] arr2 = new int[len];
		int[] arr3 = new int[len];
		System.out.println("Enter Element in First Array:");
		for(int i=0;i<arr1.length;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Element in Second Array:");
		for(int i=0;i<arr2.length;i++){
		
			arr2[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr1.length;i++){
		
			arr3[i] = arr1[i] * arr2[i];
		}
		System.out.println("After Operation the elements in third array :");
		for(int i=0;i<arr1.length;i++){
		
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
	}
}
