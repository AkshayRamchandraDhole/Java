public class MyOuter{

	public static class MyInner{
	
		public static void foo(){
		
		}
	}
	public static void main(String[] args){
	
		MyOuter m = new MyOuter();
		MyOuter.MyInner mi = m.new MyOuter.MyInner(); 
	}
}
