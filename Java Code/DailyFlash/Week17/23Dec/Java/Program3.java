interface HealthMinitryNorms{

	void guidlines1();
}
interface ICMRGuidlines extends HealthMinitryNorms{

	void guidlines2();

}
class ICMRguidlines implements ICMRGuidlines{

	public void guidlines1(){
	
		System.out.println("Wash Hands regularly");
	}
	public void guidlines2(){
	
		System.out.println("Don't go in public place");
	}

}
class Test3{

	public static void main(String[] args){
	
		ICMRguidlines i = new ICMRguidlines();
		i.guidlines1();
		i.guidlines2();
	}
}
