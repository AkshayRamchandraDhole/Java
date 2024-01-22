class Player1{

	void playerInfo(){
	
		System.out.println("Sachin");
	}
}
class Batsman1{

	public static void main(String[] args){
	
		Player1 p = new Player1(){
		
			void playerInfo(){
			
				System.out.println("Virat");
			}
		};
		p.playerInfo();	
	}
}
