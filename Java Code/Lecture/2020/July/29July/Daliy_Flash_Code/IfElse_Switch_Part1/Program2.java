class LowerUpper{

	public static void main(String args[]){
	
		char x = 'c';
		for (int i=0;i<1;i++){
		if(x >= 'a' && x <= 'z'){
			x=(char)(x - 'a' + 'A');
			System.out.println(x);

		}else if (x >='A' && x <= 'Z'){
		
			x = (char)(x + 'a' - 'A') ;
			System.out.println(x);
		}
	}
	}
} 
