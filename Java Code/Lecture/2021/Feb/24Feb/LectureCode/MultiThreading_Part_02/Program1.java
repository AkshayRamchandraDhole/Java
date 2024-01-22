class ThreadDemo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());

		for(int i=0;i<10;i++){
		
		
			System.out.println("Core2web");
		}


	}
}
class Demo{

	public static void main(String[] args){
	
		ThreadDemo th = new ThreadDemo();
		//Thread th = new Thread();
		th.start();

		System.out.println(Thread.currentThread().getName());

		for(int i=0;i<10;i++)
			System.out.println("Biencaps");

	}
}
