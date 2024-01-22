class Program4{

	public static void main(String[] args){
	
		String st = new String("Akshay");
		System.out.println(st);
		int i=0,j=st.length()-1;
		boolean s=false;
		while(i<j){
		
			if(st.charAt(i) == st.charAt(j))
				s=true;
			 i++;
			 j--;
			
		}

		if(s == true)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
		
	}
}
