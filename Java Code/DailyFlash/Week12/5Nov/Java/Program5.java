class Demo{

	Demo(){
	
		System.out.println("Object Stored..");
	}
	public static void main(String[] args){
	
		Demo[] d = new Demo[10];
		for(int i=0;i<10;i++)
			d[i]=new Demo();
		
	}
}
