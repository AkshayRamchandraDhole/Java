class PrePostTwo{

	public static void main(String args[]){

	int num1 = 20;
	int ans1=0;

	ans1 = ++num1 + ++num1;
	System.out.println(ans1);	// 43 
	System.out.println(num1);	// 22

	ans1 = num1++ + num1++;
	System.out.println(ans1);	// 45 
	System.out.println(num1);	// 24
	

}
}
