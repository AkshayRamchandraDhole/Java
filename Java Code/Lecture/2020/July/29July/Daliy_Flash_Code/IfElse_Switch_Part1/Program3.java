class GreatestAmongThree{

	public static void main(String args[]){
	
		int x = 10 , y = 18 , z = 45;
		if(x >= y && x >= z){
			
			System.out.println("X is Greater... "+x+" Among Y="+y+" And Z="+z+" X="+x);
		}else if (y >= x && y >=z){
		
			System.out.println("Y is Greater... "+y+" Among X="+x+" And Z="+z+" Y="+y);
		}else{
		
			System.out.println("Z is Greater.. "+z+" Among X="+x+" And Y="+y+" Z="+z);
		}
	}
}
