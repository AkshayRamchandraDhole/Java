class Company{

	void salary(){
		int sal = 12000;
		System.out.println("Sal : "+sal);
	}
	int salary(int sal){
		sal = 25000;
		return sal;
	}
	int[] salary(int a,int b){
		int []ans = new int[2];
		ans[0]=a*b;
		ans[1]=a+b;
		return ans;
	}
	String name(){
		return "Akshay";
	}
	String name(String s1){
		s1="Gaurav";
		return s1;	
	}

	 void array(int[]a){
		for(int i=0;i<5;i++){
		//System.out.println(a[i]);
		a[i]+=100;
		}
	}
	public static void main(String args[]){
	Company c = new Company();
	c.salary();
	int retSal = c.salary(22000);
	System.out.println(retSal);
	int []ans = c.salary(100,100);
	System.out.println("Sal= "+ans[0]);
	System.out.println("Sal= "+ans[1]);
	String s1=c.name("Akki");
	System.out.println(s1);
	
	int[] arr1={10,20,30,40,50};	
	c.array(arr1);
		for(int i=0;i<5;i++){
		System.out.println(arr1[i]);
		}	
	}
}
