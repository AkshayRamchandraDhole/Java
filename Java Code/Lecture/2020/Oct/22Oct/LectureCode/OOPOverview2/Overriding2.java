class ICC{

	void rules(){
	
		System.out.println("Rules defined by ICC");
	}
	void ground(){
	
		System.out.println("Ground given by ICC");
	}

}
class GaliCricket extends ICC{

	void rules(){
	
		System.out.println("Rule defined by us");
	}
	void ground(){
	
		System.out.println("Our own ground");
	}
}
class Playing{

	public static void main(String[] args){
	
		ICC i = new ICC();
		i.rules();
		i.ground();

		GaliCricket g = new GaliCricket();
		g.rules();
		g.ground();

		ICC i1 = new GaliCricket();
		i1.rules();
		i1.ground();

		//GaliCricket g1 = new ICC();
	}
}
