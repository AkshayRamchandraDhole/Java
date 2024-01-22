import java.io.*;
class Parent4{

	void check(){
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Parent Check");
	}
}
class Child4 extends Parent4{

	void check(){
	
		System.out.println("Child Check");
	}
	public static void main(String[] args){
	
		//Child4 c = new Child4();
		//Parent4 c = new Parent4();
		Parent4 c = new Child4();
		c.check();
	}
	
}
