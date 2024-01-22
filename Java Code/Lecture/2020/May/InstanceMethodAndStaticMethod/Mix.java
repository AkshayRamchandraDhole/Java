class Lecture{

	int InAppoff=1;

	static int youVide=1;

	void InApp(){
	
		System.out.println("In App...");
	}

	static void youTubeVideo(){
	
		System.out.println("In Youtube Video....");
	}

	public static void main(String args[]){
	
		//youTubeVideo(); In Youtube Video...
		//InApp(); Error can not reference non static contain from static context

	       Lecture l=new Lecture();
       		l.InApp();//In App

		//youTubeVideo();// In Youtube Video....		
		
		Lecture.youTubeVideo(); // In Youtube Video.....

		//l.youTubeVideo();// In Youtube Video....
	}
} 
