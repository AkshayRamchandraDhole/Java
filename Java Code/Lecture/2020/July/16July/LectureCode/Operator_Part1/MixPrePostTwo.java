class MixPrePostTwo{

	public static void main(String args[]){
	
		int num = 30;
		int ans = 0;

		ans = ++num + num--;
		System.out.println(ans); // 62
		System.out.println(num); // 30
		
		ans = num++ + --num;
		System.out.println(ans); // 60
		System.out.println(num); // 30

	}
}
