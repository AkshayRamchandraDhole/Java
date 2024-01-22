class BreakDemo{

	public static void main(String args[]){
	
	/*	for(int i=1;i<=50;i++){
		
			if(i%7==0 && i%5==0)
				break;
			else
				System.out.println("Num="+i);
		}*/

		int i=1;
		while(i<=50){
		
			if(i%7==0 && i%5==0)
				break;
			else
				System.out.println("Num="+i);
		i++;
		}
		System.out.println("Out of loop...");
	}
}
