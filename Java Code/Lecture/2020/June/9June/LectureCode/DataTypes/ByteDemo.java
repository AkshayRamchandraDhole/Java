//Byte Range:-
//		-128 to 127

class ByteDemo{

	public static void main(String args[]){
	
		byte b1=10;
		System.out.println(b1); // 10
		
		byte b2=127;
		System.out.println(b2); // 127

		b2++;
		System.out.println(b2); // -128


		/* byte b3=128;
		System.out.println(b3); 

error:	  incompatible types: possible lossy conversion from int to byte
		*/

	/*	byte b3;
		System.out.println(b3);

		error: variable b3 might not have been initialized
*/

		b2++;
		System.out.println(b2);

		b2--;
		System.out.println(b2);

	}
}
