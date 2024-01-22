class ThreadDemo{

	public static void main(String[] args){
	
		System.out.println("Single ThreadDemo");
		String threadName = Thread.currentThread().getName();
		System.out.println("Thrad Name = "+ threadName);
	}
}
