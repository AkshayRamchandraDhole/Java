class Program2{

	public static void main(String[] args){
	
		int[] my_array1 = {25,14,56,15,36,56,77,18,29,49};
		for(int i=0;i<my_array1.length;i++){
		
			if(my_array1[i] == 25 || my_array1[i] == 77)
				System.out.println("Index position of "+my_array1[i]+" is "+i);
		}
	}
}
