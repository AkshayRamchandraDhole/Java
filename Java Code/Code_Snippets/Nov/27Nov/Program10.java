class Core2web{

	public Core2web(){
	
		System.out.println("In public Default...");
	}
	private Core2web(){
	
		System.out.println("In private...");
	}
}
class Demo{
	

	public static void main(String[] args){
	
		Core2web c2w = new Core2web();
		c2w.Core2web();
	}
}
