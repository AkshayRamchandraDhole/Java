class Java{

	void lang(){
	
		System.out.println("Java is Popular Language at that time.");
	}
}
class Android extends Java{

	void access(){
	
		System.out.println("Because of popularity java,Android develop with help of java.");
	}
}
class Google extends Android{

	void famous(){
	
		lang();
		access();
		System.out.println("Google make android famous in world for example android phone.");
	}

	public static void main(String[] args){

	Google g = new Google();
	g.famous();	
}

}


