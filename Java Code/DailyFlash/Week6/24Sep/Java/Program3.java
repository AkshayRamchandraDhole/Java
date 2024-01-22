import java.io.*;
import java.util.*;
class Program3{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<4;i++){
		
			System.out.println("Enter Student Info (Name,Grade,Age,Marks) : ");
			String studInfo = br.readLine();
			String a = " ";
			
			if(i==1)
				a=",";
			else if(i==2)
				a=":";
			else if(i==3)
				a="-";
			else 
				a=" ";

			StringTokenizer st = new StringTokenizer(studInfo,a);
			
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
}
