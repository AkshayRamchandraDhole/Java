class ThreadMainNameChange{

	public static void main(String[] args){
		
		/*Thread t = Thread.currentThread();
		System.out.println("Thread Name : "+t);
		t.setName("Akshay");
		System.out.println("Thread New Name : "+t);
		int cnt = Thread.activeCount();
		System.out.println("Running Thread : "+cnt);*/

		/*String st = Thread.currentThread().getName();
		System.out.println(st);
		st="Akshay";
		System.out.println(Thread.currentThread().getName());*/
		
		Thread a = Thread.currentThread();
		System.out.println("Thread Name : "+a);
		a.setName("Akshay");
		System.out.println("Thread New Name : "+Thread.currentThread().getName());
	}
}
