class VodafoneIdea extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)	
		System.out.println("RECON Process Running");
	
	}
}
class Test{

	public static void main(String[] args){
	
		VodafoneIdea vi = new VodafoneIdea();
		vi.start();

		
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)	
		System.out.println("Health Check Running");
	}
}
