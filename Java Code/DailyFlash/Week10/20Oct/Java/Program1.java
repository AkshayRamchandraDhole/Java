class Program1{

	public static void main(String[] args){
	
		String st = "Akshay";
		System.out.println(st);
		for(int i=0;i<st.length();i++){
		
			if(st.charAt(i) == 'a' || st.charAt(i) == 'A' || st.charAt(i) == 'e' ||	st.charAt(i) == 'E' || st.charAt(i) == 'i' || st.charAt(i) == 'I' || st.charAt(i) == 'o' || st.charAt(i) == 'O' || st.charAt(i) == 'u' || st.charAt(i) == 'U')
				System.out.println(st.charAt(i));
		}
	}
}
