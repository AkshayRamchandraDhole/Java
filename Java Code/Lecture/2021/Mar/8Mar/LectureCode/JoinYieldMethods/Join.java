class MyThread extends Thread{

	public void run(){
	
		for(int i=0;i<10;i++){
		
			System.out.println("Child Thread");
		try{	
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}

		}
	}
}
class JoinDemo1{

	public static void main(String[] args) throws InterruptedException{
	
		MyThread mt = new MyThread();
		mt.start();

		mt.join();

		for(int i=0;i<10;i++){
		
			System.out.println("Parent Thread");
			Thread.sleep(1000);
		}
	}
}
