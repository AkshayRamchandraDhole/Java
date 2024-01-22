class BowlerShort extends Exception{

	String msg = null;
	BowlerShort(String str){
	
		msg=str;
	}
	public String toString(){
	
		return msg;
	}
}
class FinalMatch{

	static void bowler(int b) throws BowlerShort{
	
		if(b == 1){
		
			throw new BowlerShort("Are aaj chya match sathi ek bowler short ahe");
		}else{
		
			System.out.println("No bowler Short");
		}
	}
	public static void main(String[] args){
	
		try{
		
			bowler(1);
		}catch(BowlerShort bs){
		
			System.out.println(bs.toString());
		}
	}
}
