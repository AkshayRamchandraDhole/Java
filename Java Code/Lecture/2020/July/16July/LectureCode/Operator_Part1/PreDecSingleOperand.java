class PrePostDecDemo1{

	public static void main(String args[]){
	
		int num = 10;
		int ans;

		ans = --num;
		System.out.println(ans); // 9
		System.out.println(num); // 9
		
		ans = num--;
		System.out.println(ans); // 9
		System.out.println(num); // 8

	}
}
