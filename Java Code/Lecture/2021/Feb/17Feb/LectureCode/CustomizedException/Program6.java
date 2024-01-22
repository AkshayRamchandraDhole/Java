class MyException1 extends Exception{

	String msg=null;
	MyException1(String str){
	
		msg=str;
	}
	public String toString(){
	
		return msg;
	}
}
class CustomizedException1{

	static void checkWeight(int w) throws MyException1{
	
		if(w > 50){
		
			throw new MyException1("Weight Jara Jast Zal 50 Peksha Kami Pahije");
		}else{
		
			System.out.println("Weight kami ahe 50 peksha");
		}

	}
	public static void main(String[] args){
	
		
		try{
			System.out.println("In Try");
		
			checkWeight(70);

		}catch(MyException1 me){
		
			System.out.println("In Catch");
			System.out.println(me);
		}
	}
}
