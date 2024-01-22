// Int Range:
// 		-2147483648 to 2147483647
class IntDemo{

	public static void main(String args[]){
	
	/*	int i;
		System.out.println(i);

		error: variable i might not have been initialized */

		int i=2147483647;
		System.out.println(i); //2147364647

		i++;
		System.out.println(i); // -2147483648

		int i1=-2147483648;
		System.out.println(i); // -2147483648

		i1++;
		System.out.println(i1); // -2147483647


	}
}
