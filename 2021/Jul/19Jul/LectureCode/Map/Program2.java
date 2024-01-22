import java.util.*;
class Company{

	String compName;
	double sal;
	
	Company(String compName,double sal){
		this.compName = compName;		
		this.sal = sal;
	}
	public String toString(){
			
		return "(" + compName + "," + sal + ")" ;
	}

}
class Friends{
	public static void main(String[] args){
		
		HashMap<String,Company> h = new HashMap<String,Company>();
		h.put("Ashish",new Company("GSLab",1000000));
		h.put("Rahul",new Company("BMC Software",1200000));
		h.put("Kanha",new Company("Infosys",1300000));
		h.put("Badhe",new Company("CarPro",800000));
		
		System.out.println(h);
	}

}
