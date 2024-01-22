class SwitchByte{

	public static void main(String args[]){
	
		byte x = 100;
	//	x= -100;
	//	x= -127;
	//	x=200;  error: incompatible types: possible lossy conversion from int to byte
   //		x=128;
		switch(x){
		
			case 100:
				System.out.println("First Case");
				break;
		/*	case 200:
				System.out.println("Second Case");
				break; error: incompatible types: possible lossy conversion from int to byte

			case 128:
				System.out.println("Negative Case");
				break;
				*/
			case -100:
				System.out.println("Negative Case");
				break;
			case -127:
				System.out.println("Negative Case");
				break;
		}
	}
}
