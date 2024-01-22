public class Program2{

	int var1 = 10 ;
	public static void main(String[] args){
	
		Program2 p = new Program2();
		System.out.println(++p.var1);
	}
}
class Main{

	public static void main(String[] args){
	
		System.out.println("In Main");
		Program2 p = new Program2();
		System.out.println(++p.var1);
	}

}
