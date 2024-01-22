class MyThread extends Thread{

	public void run(){
	
		System.out.println("In run");
	}
}
class RestartThread {

	public static void main(String[] args){
	
		MyThread mt = new MyThread();
		mt.start();

		System.out.println(Thread.currentThread().getName());
		mt.start();
	}
}
