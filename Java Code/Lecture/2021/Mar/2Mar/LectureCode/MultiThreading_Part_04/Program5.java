class CBatch extends Thread{

	public void run(){
	
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("C Batch");

		CPPBatch cpb = new CPPBatch();
		cpb.start();
		cpb.setName("CPP");

	}
}
class CPPBatch extends Thread{

	public void run(){
	
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("CPP Batch");

		JavaBatch jb = new JavaBatch();
		jb.start();
		jb.setName("Java");

	}
}
class JavaBatch extends Thread{

	public void run(){
	
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Java Batch");

		OSBatch ob = new OSBatch();
		ob.start();
		ob.setName("OS");

	}
}
class OSBatch extends Thread{

	public void run(){
	
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("OS Batch");

		PythonBatch pb = new PythonBatch();
		pb.start();
		pb.setName("Python");

	}
}
class PythonBatch extends Thread{

	public void run(){
	
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Python Batch");

	}
}
class ShashiSirTeaching extends Thread{

	public void run(){
	
		System.out.println("Teaching");
		System.out.println("Thread Name : "+Thread.currentThread().getName());

		CBatch cb = new CBatch();
		cb.start();
		cb.setName("C");


	}
}
class Management{

	public static void main(String[] args){
	
		ShashiSirTeaching sst = new ShashiSirTeaching();
		sst.start();
		sst.setName("ShashiSirTeaching");

	}
}
