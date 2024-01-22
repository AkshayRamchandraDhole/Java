import java.io.*;
class Program5{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array:");
		int len = Integer.parseInt(br.readLine());
		int[] my_arr = new int[len];
		int zero=1;
		for(int i=0;i<len;i++){
		
			System.out.println("Enter Number : ");
			int ele = Integer.parseInt(br.readLine());
			my_arr[i] = ele;
			if(my_arr[i] > 0 ){
			
				System.out.println("Positive Number : "+my_arr[i]);
				if(my_arr[i] % 2 == 0)
					System.out.println("Also And Even Number : "+ my_arr[i]);
				else
					System.out.println("Also And Odd Number : "+ my_arr[i]);
			}else if(my_arr[i] == 0){
				
							
				System.out.println("Number of Os are : " + zero);
				zero++;
			}else{
			
				System.out.println("Number is Negative : "+my_arr[i]);
			}
		}
	}
}
