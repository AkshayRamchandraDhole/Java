class Program1{

	public static void main(String[] args){
	
		int playerScore[] = {106,69,24,14,10};
		int total=0;
		for(int i=0;i<5;i++){
			total+=playerScore[i];
		}
		System.out.println("Total Team Score: "+total);
	}
}
