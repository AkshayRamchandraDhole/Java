class AttendanceCheck{

	static boolean checkAttendance(int n){
	
		if(n <= 75){
		
			System.out.println("Student Attendance is: "+n+"% Processing....The Student is not eligible for exam...");
			return true;
		
		}else{
		
			System.out.println("Student Attendance is: "+n+"% Processing....The Student is eligible for exam...");
			return false;
		}	
	}

	public static void main(String args[]){
	
		AttendanceCheck.checkAttendance(80);
	}
}
