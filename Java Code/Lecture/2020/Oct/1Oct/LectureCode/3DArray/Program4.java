class In3D{

	public static void main(String[] args){
	
		int plane=2,rows=3,cols=3;

		int marr[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};
		System.out.println(marr.getClass());
		System.out.println("1st Plane are : ");
		for(int i=0;i<plane;i++){
		
			for(int j=0;j<rows;j++){
			
				for(int k=0;k<cols;k++){
				
					System.out.print(marr[i][j][k] +" ");
				}
				System.out.println(" ");
			}
			if(i==0)
				System.out.println("2nd Plane are : ");
		}
	}
}
