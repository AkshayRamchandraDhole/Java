class LogicalDemo1{

	public static void main(String arsg[]){
	
		int x = 2 ;
		int y = 3 ;
		boolean ans;

		ans = (++x < y++) && (x++ < ++y);
		System.out.println("Ans="+ans);		// false
		System.out.println("X="+x);		// 3
		System.out.println("Y="+y);		// 4

		
		ans = (++x <= y++) || (x++ > ++y);
		System.out.println("Ans="+ans);		// true
		System.out.println("X="+x);		// 4
		System.out.println("Y="+y);		// 5
	}
}
