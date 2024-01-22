class VCall{

	int book=1;
	int headphone=1;

	static int paused=0;

	void kCall(){

	
		System.out.println("KCall...");
		System.out.println("Book="+book);
		System.out.println("HeadPhone="+headphone);
		System.out.println("Video Paused="+paused);

	}

	void aCall(){
	

		System.out.println("ACall....");
		System.out.println("Book="+book);
		System.out.println("HeadPhone="+headphone);
		System.out.println("Video Paused="+paused);
	}



	public static void main(String args[]){
	
		VCall a=new VCall();
		//a.kCall();
//		a.aCall();

		
		VCall k=new VCall();
		//k.kCall();
		k.paused=1;
		
		k.kCall();

		a.aCall();


	}
}
