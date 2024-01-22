import java.io.*;
class EmployeeDetails{

	int empId ;
	String empName;
	String cmpName;
	int sal ;

	EmployeeDetails(int eid,String eName,String cName,int eSal){
	
		empId = eid ; 
		empName = eName ;
		cmpName = cName ; 
		sal = eSal ;

		System.out.println("Eid : "+empId);
		System.out.println("EName : "+empName);
		System.out.println("CName : "+cmpName);
		System.out.println("ESal : "+sal);

		System.out.println();
	}
}

class MainDemo{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Employee : ");
		int noEmp = Integer.parseInt(br.readLine());

		int[] arr = new int[noEmp];

		for(int i=0;i<noEmp;i++){
		
			System.out.println("Enter Eid : ");
			int ed = Integer.parseInt(br.readLine());
			
			System.out.println("Enter EName : ");
			String eName = br.readLine();
			
			System.out.println("Enter CName : ");
			String cName = br.readLine();
			
			System.out.println("Enter ESal : ");
			int eSal = Integer.parseInt(br.readLine());

			EmployeeDetails emp = new EmployeeDetails(ed,eName,cName,eSal);
			

		}
	}
}
