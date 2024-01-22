class Core2web{

	int noOfMem;
	Core2web(){
	
		noOfMem=10;
		//System.out.println("In Constructor");
	}
	int getNoOfMem(){
	
		return noOfMem;
	}

}
class BiEncaps extends Core2web{

	BiEncaps(int var1){
	
		noOfMem=15;
		//System.out.println("In getVar1()");
		//System.out.println(var1);
	}
	float  getNoOfEMem(int a){
	
		return(float)noOfMem;
	}
}
class Main{

	public static void main(String[] args){
	
		Core2web c2w = new BiEncaps();
		System.out.println(c2w.getNoOfMem());
		//System.out.println(c2w.getVar1(20));
	}
}
