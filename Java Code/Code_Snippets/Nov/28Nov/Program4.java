class Demo{

	Demo(int var){
	
		System.out.println("In int Demo Constructor");
	}
	Demo(Integer var){
	
		System.out.println("In Integer Demo Constructor");
	}
}
class Core2web{

	public static void main(String[] args){
	
		Demo d = new Demo(100);
	}
}
