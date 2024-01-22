class Ak{

	int headPhonesong=1;
	int lecture=1;
	
	static int openSong=1;

	void LectureYeikane(){
	
		System.out.println("In Lecture Pahane");
		System.out.println("HeadPhone="+headPhonesong);
		System.out.println("Lecture="+lecture);
		System.out.println("OpenSong="+openSong);
	}
	static void openSongYeikane(){
	
		System.out.println("\n In Song Yeikane");
		
		//System.out.println("HeadPhone="+headPhonesong);// error: non-static variable headPhonesong cannot be referenced from a static context

		//System.out.println("Lecture="+lecture); error: non-static variable lecture cannot be referenced from a static context
		
		System.out.println("OpenSong="+openSong);
		
	}

	public static void main(String args[]){
	
		Ak k=new Ak();
		k.LectureYeikane();

		openSongYeikane();
	}


}
