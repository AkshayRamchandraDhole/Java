class Program4{

	public static void main(String args[]){
	
		char[] arr1 = new char[5];
		arr1[0]='A';
		arr1[1]='B';
		arr1[2]='C';
		arr1[3]='D';
		arr1[4]='E';
		int num=0;
		for(int i=5;i>0;i--){
		
			for(int j=0;j<i;j++){
			
				System.out.print(arr1[num]+" ");
				num++;
				
			}
			num=num-i+1;
			System.out.println();
		}
	}
}
