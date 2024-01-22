class MyThread extends Thread{

	static Thread mainThread = null ;
	public void run(){

	//System.out.println(MyThread.mainThread);	
		/*try{
		mainThread.join();
		}catch(InterruptedException ie){
		
		}*/


		for(int i=0;i<10;i++){
		
			System.out.println("Child Thread");
		//	mainThread.yield();
		}
		//System.out.println(Thread.currentThread().getName());
	/*	
			
		try{	
			//mt1.join();
			//Thread.sleep(1000);

		}catch(InterruptedException ie){
		
		}

		}*/
	
	}
}
class JoinDemo1{

	public static void main(String[] args) throws InterruptedException{
	
		MyThread mt = new MyThread();
		mt.start();

		//System.out.println(Thread.currentThread().getName());

		MyThread.mainThread = Thread.currentThread();
		//mt.join();

		for(int i=0;i<10;i++){
		
			System.out.println("Parent Thread");
			mt.yield();
			//Thread.sleep(1000);
		}

		//mt.start();
	}
}
