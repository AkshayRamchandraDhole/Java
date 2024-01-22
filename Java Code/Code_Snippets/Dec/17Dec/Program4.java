class Core2web{

	class Biencaps{
	
		void fun(){
		
			System.out.println(this);
		}
	}
	public static void main(String[] args){
	
		new Core2web().gun();

	}
	void gun(){
	
		new Core2web().new Biencaps().fun();
	}
	
}
