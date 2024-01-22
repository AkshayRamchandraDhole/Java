class SleepDemo extends Thread{

	public void run() {
	
		System.out.println("In run");
		for(int i=0;i<10;i++){
			System.out.println("In child");
			try{
				sleep(500);
			}catch(InterruptedException e){
			
			}
		}
	}
}
class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{
	
		SleepDemo sd = new SleepDemo();
		sd.start();
		//sd.sleep(2000);

		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(500);
		}
		//Thread.sleep(2000);
	}
}
