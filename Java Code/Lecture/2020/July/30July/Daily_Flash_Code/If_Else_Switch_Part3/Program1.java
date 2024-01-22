import java.util.*;
class CalculatorOp{

	public static void main(String args[]){
		
		System.out.println("Enter Num1 And Num2:");
		Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 System.out.println("Enter (+,-,/,*,%) Operation you want to perform:");
		 String op = sc.next();

		 switch(op){
		 
			 case "+":
				 System.out.println("Additon is:"+(num1+num2));
				 break;
			 case "-":
				 System.out.println("Subtraction is:"+(num1-num2));
				 break;
			 case "*":
				 System.out.println("Multiplication is:"+(num1*num2));
				 break;
			 case "/":
				 System.out.println("Division is:"+(num1/num2));
				 break;
			 case "%":
				 System.out.println("Modulo is:"+(num1%num2));
				 break;
			default:
				 System.out.println("Please enter proper operations...");
				 break;
		 }
	}
}
