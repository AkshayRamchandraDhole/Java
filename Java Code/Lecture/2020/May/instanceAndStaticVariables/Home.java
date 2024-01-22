class Ghar{

	//Instance Variable

	int mob=1;
	int laptop=1;

	//Static Variable
	
	static int tv=1;

	void akMethod(){

		System.out.println("Ak Method");
	
		System.out.println("Mob="+mob);
		System.out.println("Laptop="+laptop);
		System.out.println("TV="+tv);
	}

	void gdMethod(){

		System.out.println("GD Method");
		System.out.println("Mob="+mob);
		System.out.println("Laptop="+laptop);
		System.out.println("TV="+tv);

	}
	

	public static void main(String args[]){
	
		Ghar g=new Ghar();
		//g.akMethod();
		g.mob=0;
		g.tv=0;
		
		g.akMethod();

		//g.gdMethod();

		Ghar g1=new Ghar();
		g1.laptop=0;
		g1.gdMethod();
		//g1.akMethod();
	}
}
