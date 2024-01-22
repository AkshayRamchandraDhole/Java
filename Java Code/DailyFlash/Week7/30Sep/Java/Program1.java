class Program1{

	public static void main(String[] args){
	
		int[] my_array1 = {1789,2035,1899,2013,1458,2458,1254,1472,2365,2015};
		for(int i=0;i<my_array1.length;i++){
		
			if(my_array1[i] == 2013 || my_array1[i] == 2015)
				System.out.println("Contains "+my_array1[i]+" in array");
		}
	}
}
