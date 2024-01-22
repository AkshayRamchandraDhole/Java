abstract class Marks{

	abstract void getPercentage();
}
class A extends Marks{

	int s1,s2,s3;
	A(int sub1,int sub2,int sub3){
	
		s1=sub1;
		s2=sub2;
		s3=sub3;

	}
	void getPercentage(){
	
		double marks=s1+s2+s3;
		System.out.println("A's Percentage = "+(marks/300)*100);

	}
}
class B extends Marks{

	int s1,s2,s3,s4;
	B(int sub1,int sub2,int sub3,int sub4){
	
		s1=sub1;
		s2=sub2;
		s3=sub3;
		s4=sub4;

	}
	void getPercentage(){
	
		double marks=s1+s2+s3+s4;
		System.out.println("B's Percentage = "+(marks/400)*100);

	}
}
class Test2{

	public static void main(String[] args){
	
		A a = new A(98,56,77);
		a.getPercentage();
		B b = new B(95,52,66,88);
		b.getPercentage();

	}
}

