class SwitchShort{

	public static void main(String args[]){
	
		short x = 32767;
		//x= -32768;
      //	x= 32768; error: incompatible types: possible lossy conversion from int to short

//		x=-32769;  error: incompatible types: possible lossy conversion from int to byte
   		x=20000;
		switch(x){
		
			case 32767:
				System.out.println("First Case");
				break;
		/*	case 32768:
				System.out.println("Second Case");
				break; error: incompatible types: possible lossy conversion from int to byte
		
			case -32789:
				System.out.println("Negative Case");
				break; */
				
			case -32768:
				System.out.println("Negative Case");
				break;
			case 20000:
				System.out.println("Negative Case");
				break;
		}
	}
}
