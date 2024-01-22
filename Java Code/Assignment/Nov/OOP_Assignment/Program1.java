class Army{

	void show(){

		Infantry i = new Infantry(10);
	}
	public static void main(String[] args){
	
		Army a = new Army();
		a.show();
	}

}
class Infantry{

	Infantry(int no){
	
		System.out.println("Number of Soliders : "+no);

	}
}


