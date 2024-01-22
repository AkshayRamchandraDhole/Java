class ThreadDemo extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
			System.out.println("Core2web");
	}
	//run() overload check
	//
	
	/*public void run(int x){
	
		System.out.println("My run");
	}*/

	/*public void start(int x){
	
		System.out.println("My start()");
		//start();
	}*/

}
class ThreadScenario{

	public static void main(String[] args){
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		//obj.start(10);
		//obj.run(); run() la cl jato pn main thread ni run hote te
		//obj.run(19);

		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
			System.out.println("Biencaps");
		
	}
}
