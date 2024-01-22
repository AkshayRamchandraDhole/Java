class ArrayDemo1{

	public static void main(String[] args){
	
		//int jarr1[];
		//int jarr1[5];

		//int[5] jarr1;

		//int jarr1[]={10,20,30,40,50};


		//int jarr1[5]={10,20,30,40,50};

	/*	int jarr1[] ={};
		jarr1[0]=10; */

		int jarr1[]={10,20,30,40};
		//System.out.println(jarr1[]);
		//System.out.println(jarr1); // Print address
		jarr1[0]=90;
		//System.out.println(jarr1[0]);

	/*	int jarr2[]={};
		jarr2[0]=10;
		jarr2[1]=20;
		jarr2[2]=30;

		for(int i=0;i<3;i++)
			System.out.println(jarr2[i]);
	*/
		int jarr2[]={10,20,30,40,50};
		jarr2[0]=50;
		jarr2[1]=60;
		jarr2[2]=70;
		jarr2[3]=80;
		jarr2[4]=90;
	//	jarr2[5]=100;

		for(int i=0;i<5;i++)
			System.out.println(jarr2[i]);

		int[] jarr3 = new int[2];
		jarr3[0]=101;
		jarr3[1]=102;
		//jarr3[2]=103;

		for(int i=0;i<2;i++)
			System.out.println(jarr3[i]);
		
	}
}
