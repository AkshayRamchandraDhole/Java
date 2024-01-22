class TernaryEvenOdd{

	public static void main(String args[]){
	
		int num1 = 45, num2 = 18;
		String ans1 ,ans2 ;

		ans1 = num1 % 2 ==0 ? "Number is Even" : "Number is Odd" ;
		System.out.println(num1+" Ans1 = "+ans1);
		ans2 = num2 % 2 == 0 ? "Number is Even" : "Number is Odd" ;
		System.out.println(num2+" Ans2 = "+ans2);
	}
}
