class SwitchChar{

	public static void main(String args[]){
	
		char x = 'b';
		//x='A';
		//x=-10; error: incompatible types: possible lossy conversion from int to char
		//x = 0;
	//	x = '8';
		//x = 65535;
	//	x = 65536; 	error: incompatible types: possible lossy conversion from int to char
	//	x = 65 ;
		switch(x){
		
			case 'a':
				System.out.println("a Char");
				break;
			case 'b':
				System.out.println("b Char");
				break;
			case 65:
				System.out.println("65 Char");
				break;
			case 'B':
				System.out.println("B Char");
				break;
		/*	case -10:    error: incompatible types: possible lossy conversion from int to char

				System.out.println("a Char");
				break;
			case 'b':			error: duplicate case label

				System.out.println("b Char");
				break;

		*/

			case 0:
				System.out.println("0 Char");
				break;
			case '8':
				System.out.println(" '0' Char");
				break;

			case 65535:
				System.out.println("65535 Char");
				break;
	/*		case 65536:		error: incompatible types: possible lossy conversion from int to char
				System.out.println("b Char");
				break; */
		}
	}
}
