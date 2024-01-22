import java.io.*;
import java.util.*;
class Program4{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Student Info (Name,Grade,Age,Marks) : ");
		String studInfo = br.readLine();
		
		StringTokenizer st = new StringTokenizer(studInfo,",");

		String studName = st.nextToken().trim();
		String studGrade = st.nextToken().trim();
		int studAge = Integer.parseInt(st.nextToken().trim());
		double studMark = Float.parseFloat(st.nextToken().trim());

		System.out.println("Name : "+studName);
		System.out.println("Garde : "+studGrade);
		System.out.println("Age : "+studAge);
		System.out.println("Mark : "+studMark);



	}
}
