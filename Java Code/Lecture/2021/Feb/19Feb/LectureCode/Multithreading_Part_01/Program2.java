class MultiThreadDemo extends Thread{

	public void run(){
	
		System.out.println("In run method");
		String thName = Thread.currentThread().getName();
		System.out.println("Thread Name = "+thName);
	}
	public static void main(String[] args){
	
		MultiThreadDemo t = new MultiThreadDemo();
		t.start();

		System.out.println("MultiThreadDemo");
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name = "+ threadName);
	}
}
