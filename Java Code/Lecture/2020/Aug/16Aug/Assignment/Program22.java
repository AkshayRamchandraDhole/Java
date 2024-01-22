class Program22{

	public static void main(String args[]){
	
		char ch='A';
		System.out.println("Char="+ch);
		String sVar;
		switch(ch){
		
			case 'a':
			case 'A':
				System.out.println(sVar="Vowel");
			break;
			case 'e':
			case 'E':
				System.out.println(sVar="Vowel");
			break;
			case 'i':
			case 'I':
				System.out.println(sVar="Vowel");
			break;
			case 'o':
			case 'O':
				System.out.println(sVar="Vowel");
			break;
			case 'u':
			case 'U':
				System.out.println(sVar="Vowel");
			break;

			default:
				System.out.println(sVar="Consonant");
			break;
		}
	}
}
