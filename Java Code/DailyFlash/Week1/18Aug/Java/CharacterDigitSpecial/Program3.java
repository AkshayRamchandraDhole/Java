class Program3{

	public static void main(String args[]){
	
		char ch='k';
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			System.out.println(ch+" is alphabet");
		else if(ch>=48 && ch<=57)
			System.out.println(ch+" is digit");
		else
			System.out.println(ch+" is special character");
			
	}
}
