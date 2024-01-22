class Program7{

	public static void main(String args[]){
	
		int a=50,b=7,c=6;
		String d = a < b ? ((a < c) ? "A is small":"C is small"): ((b < c) ? "B is small":"C is small" );
		System.out.println(d);
	}
}
