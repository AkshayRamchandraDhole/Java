import java.util.*;
class Jagged3D{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Plane : ");
		int p = sc.nextInt();
		
		System.out.println("Enter Number of rows : ");
		int r = sc.nextInt();

		double[][][] arr = new double[p][r][];
		
		for(int i=0;i<p;i++){
		
			for(int j=0;j<r;j++){
				
				System.out.println("Enter Col for "+i+" "+j+" : ");
				int c = sc.nextInt();
				arr[i][j] = new double[c];
			}
		}
		
		/*arr[0][0] = new double[2];
		arr[0][1] = new double[3];
		arr[0][2] = new double[4];
		
		arr[1][0] = new double[3];
		arr[1][1] = new double[1];
		arr[1][2] = new double[3];*/
		
		System.out.println("Enter Element : ");
		for(int i=0;i<p;i++){
		
			for(int j=0;j<r;j++){
				
				for(int k=0;k<arr[i][j].length;k++){

				arr[i][j][k] = sc.nextDouble();
				}
			}
		}
		for(int i=0;i<p;i++){
				
			System.out.println("Plane "+(i+1)+" is : ");
			for(int j=0;j<r;j++){
			
				for(int k=0;k<arr[i][j].length;k++){
				
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		System.out.println();
		}

	}
}
