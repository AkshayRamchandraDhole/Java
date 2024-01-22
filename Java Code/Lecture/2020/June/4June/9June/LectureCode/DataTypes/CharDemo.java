// Char Range:
// 		0 to 65535

class CharDemo{

	public static void main(String args[]){
	
	/*	char c;
		System.out.println(c);
	
		 error: variable c might not have been initialized
	*/

		char c='A';
		System.out.println(c); // A

		char c1='0';
		System.out.println(c1); // 0

		char c2= 1;
		System.out.println(c2); //

		char c3 = 65;
		System.out.println(c3); // A
		
		char c4 = 97;
		System.out.println(c4); // a


		char c5 = 93;
		System.out.println(c5); // ]

		char c6 = 48;
		System.out.println(c6);	 // 0
	}
}
