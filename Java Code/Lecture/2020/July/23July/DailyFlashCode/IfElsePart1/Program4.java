class VowelCheck{

	static void vowels(){
	
		char ch = 'z';
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
		
			System.out.println("Character is Vowels:"+ch);
		}else{
		

			System.out.println("Character is Consonant:"+ch);
		
		}
	}

	public static void main(String args[]){
	
		VowelCheck.vowels();
	}
}
