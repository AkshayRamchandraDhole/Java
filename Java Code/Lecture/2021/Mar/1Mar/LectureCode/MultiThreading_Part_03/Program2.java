class ThreadPriority extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class ThreadTest{

	public static void main(String[] args){
	
		ThreadPriority obj = new ThreadPriority();
		//obj.setPriority(0);
		obj.start();
		obj.setName("Shashi");
		obj.setPriority(1);

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
