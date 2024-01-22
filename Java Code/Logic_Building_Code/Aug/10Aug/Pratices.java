class Pro1{

	public static void main(String args[]){
	
	/*	int num=1254;
		while(num!=0){
		
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
			
				fact=fact*i;
			}
			System.out.println("Factorial:"+fact);
			num=num/10;
		}*/

	/*	for(int i=1;i<=4;i++){
			char cha='A';
			char ich='a';
		for(int j=1;j<=5;j++){
			if(i%2!=0){
				System.out.print(cha);
				cha++;
			}
			else{
				System.out.print(ich);
				ich++;
		}}
		System.out.println();
		}*/
		int num=1254;
		while(num!=0){
		
			int rem=num%10;
			switch(rem){
			
				case 0:
					System.out.println("Zero");
				break;
				case 1:
					System.out.println("One");
				break;
				case 2:
					System.out.println("Two");
				break;
				case 5:
					System.out.println("Five");
				break;
				case 4:
					System.out.println("Four");
				break;
			}

			num=num/10;
		}
	}
}
