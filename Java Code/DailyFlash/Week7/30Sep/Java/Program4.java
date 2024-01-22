import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array:");
		int len = Integer.parseInt(br.readLine());
		int[] my_arr = new int[len];
		for(int i=0;i<len;i++){
		
			System.out.println("Enter Student Age : ");
			int ele = Integer.parseInt(br.readLine());
			my_arr[i] = ele;
		}
		int max=0,ind=0;
		for(int i=0;i<my_arr.length;i++){
			max = my_arr[i];
			for(int j=0;j<my_arr.length;j++){
				if(max < my_arr[j]){
					
					max = my_arr[j];
					ind = j ;
				}
			}	
		}
		System.out.println("Max = " + max + " index " + ind);
	}
}
