class EvnAddOddMul{

	public static void main(String args[]){
	
		int iNum = 219837 ;
		int iCount = 0,rem=0;
		int add=0,mul=1;
		System.out.println("Digit is:"+iNum);
		while(iNum!=0){
		rem=iNum % 10;
		iCount++;
			if(iCount%2==0){
				add=add+rem;
			}else{
				mul=mul*rem;
			}
		iNum = iNum / 10;
		}
		System.out.println("Multiplication of Odd Digit is:"+mul);
		System.out.println("Addition of Even Digit is:"+add);

	}
}
