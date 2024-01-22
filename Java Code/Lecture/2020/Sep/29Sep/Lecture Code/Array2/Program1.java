class ArrayDemo1{

	public static void main(String[] args){
	
		int[] ijarr = {1,2,3,4,5};
		for(int i=0;i<5;i++)
			System.out.println(ijarr[i]);
		ijarr[0]=10;
		ijarr[1]=20;
		ijarr[2]=30;
		ijarr[3]=40;
		ijarr[4]=50;
		for(int i=0;i<5;i++)
			System.out.println(ijarr[i]);
		System.out.println(ijarr.getClass());
	}
}
