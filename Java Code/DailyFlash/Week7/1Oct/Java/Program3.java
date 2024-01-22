import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array : ");
		int len = Integer.parseInt(br.readLine());
		int[] arr1 = new int[len];
		int max=0;
		for(int i=0;i<len;i++){
		
			System.out.println("Enter Array Element:");
			int ele = Integer.parseInt(br.readLine());
			arr1[i] = ele;
		}
		System.out.println("Element of Array is : ");
		for(int i=0;i<arr1.length;i++){
		
			System.out.println(arr1[i]);
		}
		max = arr1[0];
		for(int i=0;i<arr1.length;i++){
			
			if(max < arr1[i])
				max = arr1[i];
			
		}
		System.out.println("Greatest Value of Array is : " + max);

	
		
	}
}
