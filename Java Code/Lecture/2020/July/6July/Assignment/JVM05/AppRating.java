// Rating is out of 5 ....
class Core2Web{

	static int download=1500;
	int rating=5;

	static void getDownload(){
	
		System.out.println("Core2Web App Downloads="+download);
	}

	void getRating(){
	
		System.out.println("Core2Web App Rating="+rating);
	}
}

class Unacademy{

	static int download=10000000;
	int rating=4;
	
	static void getDownload(){
	
		System.out.println("Unacademy App Downloads="+download);
	}

	void getRating(){
	
		System.out.println("Unacademy App Rating="+rating);
	}
}

class Rating{

	public static void main(String args[]){

		Core2Web user1=new Core2Web();
		user1.rating=5;
		user1.getDownload();
		user1.getRating();

		Core2Web user2=new Core2Web();
		user2.rating=4;
		user2.getDownload();
		user2.getRating();

		Unacademy user3=new Unacademy();
		user3.rating=3;
		user3.getDownload();
		user3.getRating();

		Unacademy user4=new Unacademy();
		user4.rating=5;
		user4.getDownload();
		user4.getRating();
	

	}
}
