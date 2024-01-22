class ThreadDemo extends Thread{

	ThreadDemo(ThreadGroup tg,String tName){
	
		super(tg,tName);

	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName());
	
		task();
	}
	void task(){
	
		try{
		
			Thread.sleep(3000);
		}catch(InterruptedException ie){
		
			System.out.println("Interrupt Kelay");
		}
	}

}
class ThreadGroupDemo{

	public static void main(String[] args){
	
		ThreadGroup tg = new ThreadGroup("ParentGroup");

		ThreadDemo t1 = new ThreadDemo(tg,"One");
		ThreadDemo t2 = new ThreadDemo(tg,"Two");
		ThreadDemo t3 = new ThreadDemo(tg,"Three");

		//System.out.println(tg.activeCount());
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(tg.activeCount());
		//tg.interrupt();
		//tg.destroy();
		//tg.interrupt();

		System.out.println(tg.getName());
		System.out.println(tg.getParent());
		System.out.println(tg.isDaemon());
		tg.checkAccess();
	}
}
