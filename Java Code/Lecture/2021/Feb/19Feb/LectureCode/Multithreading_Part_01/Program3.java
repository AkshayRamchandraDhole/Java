class Cricket extends Thread{

	public void run(){
	
		System.out.println("In run Thread");
		String st = Thread.currentThread().getName();
		System.out.println("Bowling");
		System.out.println("Thread Name : "+st);
	}
	public static void main(String[] args){
	
		Cricket c = new Cricket();
		c.start();

		System.out.println("In Main Thread");
		String st = Thread.currentThread().getName();
		System.out.println("Batting");
		System.out.println("Thread Name : "+st);
	
	}
}
