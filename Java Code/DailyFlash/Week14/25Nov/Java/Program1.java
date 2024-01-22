class Hostel{

	int hostelID;

	Hostel(int hid){
	
		hostelID=hid;
	}


	class Student{
	
		int studentID;
		int hostelID;

		Student(int sid,int hid){
		
			studentID=sid;
			hostelID=hid;
		}

		void checkHostelID(Hostel h){
		
			if(h.hostelID==this.hostelID){
			
				System.out.println("Student Allowed");

			}else{
			
				System.out.println("Student not allowed");
			}
		}
	}

	public static void main(String[] args){
	
		Hostel h = new Hostel(102);
		Student s1 = h.new Student(201,101);
		Student s2 = h.new Student(202,102);
		s1.checkHostelID(h);
		s2.checkHostelID(h);
		
	}
}
