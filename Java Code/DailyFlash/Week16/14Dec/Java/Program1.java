class Arithmetic {

	Arithmetic(){
	
		System.out.println("Arthmetic");
	}
	int add(int a,int b){
		return a+b;
	}
}
class Adder extends Arithmetic{

	Adder(){
	
	}
}
class Test{

	public static void main(String args[]){
	
		Adder ad = new Adder();
		System.out.println(ad.add(10,18));

	}
}
