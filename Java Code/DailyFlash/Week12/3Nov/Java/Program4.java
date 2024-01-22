class Area{

	Area(int side){
	
		System.out.println("Area of square : "+(side*side));
	}

	Area(int len,int brd){
	
		System.out.println("Area of Rectangle : "+(len*brd));
	}

	public static void main(String[] args){
	
		Area a1 = new Area(10);

		Area a2 = new Area(10,10);
	}
}
