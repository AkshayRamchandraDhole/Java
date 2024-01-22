import java.io.*;
class Program5{

	public static void main(String ...args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		int iNum1=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		int iNum2=Integer.parseInt(br.readLine());
		int tmp=1,gcd=0;
	       while(tmp<=iNum1 && tmp<=iNum2){
	       
		       if(iNum1 % tmp ==0 && iNum2 % tmp == 0)
			       gcd=tmp;
		       tmp++;

	       }	
	       System.out.println("The of GCD of "+iNum1+" & "+iNum2+" is "+gcd);
	}
}
