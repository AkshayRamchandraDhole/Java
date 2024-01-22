class MaxNumDigit{

	public static void main(String args[]){
	
		int iNum = 219837 ;
		int iCount = 0 ;
		int rem=0,tmp = 0;
		System.out.println("Digit is:"+iNum);
		while(iNum!=0){
		rem=iNum % 10;
		if(rem > tmp)
			tmp=rem;
		iNum = iNum / 10;
		}
		System.out.println("Largest Number of Digit is:"+tmp);

	}
}
