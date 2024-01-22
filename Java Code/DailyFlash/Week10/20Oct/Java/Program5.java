class Program5{

	public static void main(String[] args){
	
		String st = new String("Akshayyy10");
		System.out.println(st);
		int c=0;
		if(st.length() <= 8){
			System.out.println("Password must greater than length 8 ");
		
		}else{
		for(int i=0;i<st.length();i++){
			
			char ch = st.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='1' && ch<='9') || (ch=='@' || ch=='#' || ch=='$'))
					c++;
		
		}
		
		}
		if(c>=3)
			System.out.println("true");
		else
			System.out.println("false");

		
	}
}
