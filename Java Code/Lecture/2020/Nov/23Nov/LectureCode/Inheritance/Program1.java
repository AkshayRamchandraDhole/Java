class Core2Web{

	Core2Web(){
	
		System.out.println("Core2Web Constructor");
	}

	void learning(){
	
		System.out.println("Programming Language");
		System.out.println("Guide : Shashi");
	}
}
class Incubator extends Core2Web{

	Incubator(){
	
		System.out.println("Incubator Constructor");
	}
	void implementation(){
	
		System.out.println("Projects");
		System.out.println("Self Learning");
	}
}
class Network extends Core2Web{

	void connect(){
	
		System.out.println("Coder Community");
		System.out.println("Guide : Professional");
	}
	Network(){
	
		System.out.println("Network Constructor");
	}
}
class Student{

	public static void main(String[] args){
	
		Core2Web c2w = new Core2Web();
		c2w.learning();

		Incubator ibtr = new Incubator();
		ibtr.implementation();
		ibtr.learning();

		//Core2Web c2w1 = new Incubator();
		//c2w1.implentation();
		//c2w1.learning();

		Network nt = new Network();
		nt.connect();
		nt.learning();
	}
}
