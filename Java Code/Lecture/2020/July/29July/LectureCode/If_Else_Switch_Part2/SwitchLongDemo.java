class SwitchLong{

	public static void main(String args[]){
	
		long x = 100l;// error: incompatible types: possible lossy conversion from long to int
		switch(x){
		
			case 100:
				System.out.println("First Case");
				break;
		}
	}
}
