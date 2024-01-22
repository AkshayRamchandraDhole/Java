class AvgNum{

	public static void main(String args[]){
	
		int iNum = 219837 ;
		int iCount = 0 ;
		int rem=0 , sum=0 ;
		System.out.println("Digit is:"+iNum);
		while(iNum!=0){
		rem=iNum % 10;
		iCount ++;
		sum = sum + rem;
		iNum = iNum / 10;
		}
		System.out.println("Sum of Digit is:"+sum);
		System.out.println("Count of Digit is:"+iCount);
		System.out.println("Avg of Digit is:"+(sum / iCount));

	}
}
