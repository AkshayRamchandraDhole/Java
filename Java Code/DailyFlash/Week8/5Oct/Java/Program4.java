import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Length of Array : ");
		int len = Integer.parseInt(br.readLine());
		int arr1[] = new int[len];
		System.out.println("Enter Array Element : ");
		
		for(int i=0;i<arr1.length;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Index at which you want to add element : ");
		int ind = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number to add : ");
		int num = Integer.parseInt(br.readLine());

		int[] newarr1 = new int[arr1.length+1];
		
		for(int i=0;i<ind;i++){
			newarr1[i] = arr1[i];
		}

		newarr1[ind] = num ;
		
		for(int i=ind + 1;i<=arr1.length;i++){
			newarr1[i] = arr1[i -1];
		}
		System.out.println("New Array : ");
		for(int i=0;i<newarr1.length;i++){
			System.out.print(newarr1[i]+" ");
		}
		
		System.out.println();
	}
}
