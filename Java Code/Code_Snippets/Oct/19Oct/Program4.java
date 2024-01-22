class Program4{

	public static void main(String args[]){
	
		Object[] arr1 = new Program3[3];
		arr1[0] = new Program3();
		arr1[1] = new Program3();
		if(arr1[0] instanceof Program3)
			System.out.println("INstance of Core2web");
		else	
		System.out.println("Instance of Object");
		
		
	}
}
