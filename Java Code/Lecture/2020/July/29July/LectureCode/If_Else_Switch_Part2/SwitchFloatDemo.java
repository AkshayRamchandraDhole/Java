class SwitchLong{

	public static void main(String args[]){
	
		float x = 100f;// error: incompatible types: possible lossy conversion from float to int
		switch(x){
		
			case 100.0f:
				System.out.println("First Case");
				break;
			case 200.0f:
				System.out.println("Second Case");
				break;
		}
	}
}
