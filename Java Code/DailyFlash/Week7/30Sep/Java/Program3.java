import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array:");
		int len = Integer.parseInt(br.readLine());
		double[] my_arr = new double[len];
		double total=0;
		double per;
		for(int i=0;i<len;i++){
		
			System.out.println("Enter Student Marks out of(50):");
			int ele = Integer.parseInt(br.readLine());
			my_arr[i] = ele;
			total+=my_arr[i];
		}
		System.out.println("Array Element is:");
		for(int i=0;i<my_arr.length;i++){
		
			System.out.println(my_arr[i]);
		}
		double sum = len * 50 ;
		per = (total / sum);
		System.out.println("Total Marks : "+ total + " And percentage is : " + (per*100));
	}
}
