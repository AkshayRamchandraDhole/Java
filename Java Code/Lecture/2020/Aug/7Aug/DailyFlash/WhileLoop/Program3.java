class Program3{

	public static void main(String args[]){
	
		int iNum=10000;
		int iCount = 0 ;
		int i = 1;
		while(i<=1000){
			if(i%32==0 && i%7==0){
				iCount++;
				System.out.println(i);
				if(iCount == 10){
				System.out.println("Breaking Loop....");
				System.out.println("Because Count is 10");
				break;
				}else if(i % 6 == 0){		
				System.out.println("Breaking Loop....");
				System.out.println(i+" is dividible by 6");
				break;
				}
			}
		i++;
		}

	}
}
