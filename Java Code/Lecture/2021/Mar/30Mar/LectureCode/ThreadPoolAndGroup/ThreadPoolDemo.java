import java.util.concurrent.*;
class ThreadExeDemo implements Runnable{

	String workNum = null;

	ThreadExeDemo(String workNum){
	
		this.workNum = workNum;
	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName() +" Start Task " + workNum);
		
		workAssign();

		System.out.println(Thread.currentThread().getName() +" End Task " + workNum);
	}

	void workAssign(){
	
		try{
		
			Thread.sleep(3000);
		}catch(InterruptedException ie){
		

		}
	}

}
class MyThreadExecutor{

	public static void main(String[] args){
	
		ExecutorService exec = Executors.newFixedThreadPool(10);

		for(int i=0;i<5;i++){
		
			ThreadExeDemo work = new ThreadExeDemo(" "+i);
			exec.execute(work);
		}
		exec.shutdown();
	}
}
