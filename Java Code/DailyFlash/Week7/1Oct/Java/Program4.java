import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Overs : ");
		int ovr = Integer.parseInt(br.readLine());
		int[] arr1 = new int[ovr*6];
		int totalRun=0 ,zero=0,fours=0,six=0,balls=0,other=0;
		for(int i=0;i<ovr*6;i++){
		
			System.out.println("Enter Runs:");
			int ele = Integer.parseInt(br.readLine());
			arr1[i]=ele;
			totalRun+=arr1[i];		
			balls++;
			if(arr1[i] == 4 )
				fours++;
			else if(arr1[i] == 6)
				six++;
			else if(arr1[i] == 1 || arr1[i] == 2 || arr1[i] == 3)
				other++;
			else
				zero++;

		}
		System.out.println("Element of Array is: ");
		for(int i=0;i<arr1.length;i++){
		
			System.out.println(arr1[i]);
		}

		System.out.println("Total Score is : "+totalRun);
		System.out.println("Total number of Balls is : "+balls);
		System.out.println("Total number of Six is : "+six);
		System.out.println("Total number of fours is : "+fours);
		System.out.println("Total number of 1,2,3 is : "+other++);
		System.out.println("Total number of zero is : "+zero);
		
	}
}
