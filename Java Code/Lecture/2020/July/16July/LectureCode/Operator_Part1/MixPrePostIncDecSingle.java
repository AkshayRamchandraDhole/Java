class MixPrePost{

	public static void main(String args[]){
	
		int num = 20;
		int ans;

		ans = num++;
		System.out.println(ans); //20
		System.out.println(num); //21
		
		ans = --num;
		System.out.println(ans); // 20
		System.out.println(num); // 20
		
		ans = ++num;
		System.out.println(ans); // 21
		System.out.println(num); // 21


		ans = num--;
		System.out.println(ans); // 21
		System.out.println(num); // 20
	}
}

