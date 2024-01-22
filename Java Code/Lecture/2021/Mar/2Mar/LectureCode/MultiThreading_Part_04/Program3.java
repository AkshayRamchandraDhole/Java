class MyThread implements Runnable{

	public void run(){
	
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class RunnableDemo{


	public static void main(String[] args){
	
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();

		System.out.println(Thread.currentThread().getName());
	}
}
