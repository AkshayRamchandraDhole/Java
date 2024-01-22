// Short Range:
// 		-32768 to 32767

class ShortDemo{

	public static void main(String args[]){
	
		/*short s1=32777;
		System.out.println(s1);

		error: incompatible types: possible lossy conversion from int to short
		*/

	/*	short s;
		System.out.println(s);

		error: variable s might not have been initialize
		*/

		short s=32767;
		System.out.println(s); //32767 
		
		s++;
		System.out.println(s); // -32768

		s++;
		System.out.println(s); // -32767

		short s1=3777;
		System.out.println(s1); // 3777
	}
}
