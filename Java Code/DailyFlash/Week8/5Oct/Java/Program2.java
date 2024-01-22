import java.io.*;
class Program2{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of rows and cols : ");
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());
		int[][] arr1 = new int[row][col];
		System.out.println("Enter Element in 2D Array:");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++)
				arr1[i][j] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Element in Second Array:");
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){
				
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int evenSum=0,max=0;;
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){
				
				if(arr1[i][j] % 2 == 0)

					evenSum+=arr1[i][j];
				else{
				
					max=arr1[i][j];
					if(max < arr1[i][j])
						max = arr1[i][j];
				}
			}
		}

		System.out.println("Sum of Even :" + evenSum);
		System.out.println("Max Odd Element :" + max);
		System.out.println(evenSum+" * "+ max +" = "+ (evenSum*max) );
	}
}
