class SwitchInt{

	public static void main(String args[]){
	
		int x = 100;
		//x= -100;
		x=200;
		switch(x){
		
			case 100:
				System.out.println("First Case");
				break;
			case 200:
				System.out.println("Second Case");
				break;
			case -100:
				System.out.println("Negative Case");
				break;
		}
	}
}
