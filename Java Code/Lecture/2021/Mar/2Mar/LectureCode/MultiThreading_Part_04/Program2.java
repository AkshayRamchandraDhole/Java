class NewThread extends Thread{

	public void run(){
	
		System.out.println("In run2");
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread extends Thread{

	public void run(){
	
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
		
		NewThread nw = new NewThread();
		nw.start();
	}
}
class MultipleThread {

	public static void main(String[] args){
	
		MyThread mt1 = new MyThread();
		mt1.start();

		System.out.println(Thread.currentThread().getName());
		
		MyThread mt2 = new MyThread();
		mt2.start();
	}
}
