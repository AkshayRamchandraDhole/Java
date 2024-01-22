class SwitchLong{

	public static void main(String args[]){
	
		double x = 100;// error: incompatible types: possible lossy conversion from float to int
		switch(x){
		
			case 100.0:
				System.out.println("First Case");
				break;
			case 200.0:
				System.out.println("Second Case");
				break;
		}
	}
}
