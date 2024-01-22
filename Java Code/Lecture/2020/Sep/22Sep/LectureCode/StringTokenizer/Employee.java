import java.util.*;
import java.io.*;
class EmpInfo{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Info : ");
		String empDetail = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetail,",");

		String token1 = st.nextToken().trim();
		String token2 = st.nextToken().trim();
		String token3 = st.nextToken().trim();

		int empId = Integer.parseInt(token1);
		
		//int empId = Integer.parseInt(st.nextToken().trim());
		//String token2 = st.nextToken().trim();
		//String token3 = st.nextToken().trim();
		
		String empName = token2;
		float empsal = Float.parseFloat(token3);

		System.out.println("EmpId : "+empId);
		System.out.println("EmpName : "+empName);
		System.out.println("EmpSal : "+empsal);

	
	}
}
