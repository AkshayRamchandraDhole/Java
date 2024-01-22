class Program1{

	public static void main(String args[]){
	
		char ch='&';
		if(ch>='a' && ch<='z')
			System.out.println(ch+" is lower case");
		else if(ch>='A' && ch<='Z')
			System.out.println(ch+" is upper case");
		else
			System.out.println(ch+" is not character");
	}
}
