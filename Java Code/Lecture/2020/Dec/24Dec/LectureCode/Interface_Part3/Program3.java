interface Player2{

	void playerInfo();
}
class Batsman2{

	public static void main(String[] args){
	
		Player1 p = new Player1(){
		
			void playerInfo(){
			
				System.out.println("Virat");
			}
		};
		p.playerInfo();	
	}
}
