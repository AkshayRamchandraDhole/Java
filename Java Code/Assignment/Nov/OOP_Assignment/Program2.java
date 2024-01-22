class Cake{

	public static void main(String[] args){
	
		Egg e = new Egg(10);
		Chocolate c = new Chocolate(20);
		Cream c1 = new Cream(30);
		System.out.println("Total Calories : "+(e.cal+c.cal+c1.cal));
	}
}
class Egg{

	int cal=0;
	Egg(int cal){
		this.cal=cal;
	}
}
class Chocolate{

	int cal = 0 ;
	Chocolate(int cal){
	
		this.cal=cal;
	}
}
class Cream{

	int cal=0;
	Cream(int cal){
	
		this.cal=cal;
	}
}
