class Program3{

	public static void main(String args[]){
	
		int i = 5, j = 4 ;
		boolean k;

		k = (i++ >= j++) && (--j < i++);
		System.out.println("K="+k);	// true
		System.out.println("I="+i);	// 7
		System.out.println("J="+j);	// 4
		
		k = (--i < j--) || (j++ >= ++i);
		System.out.println("K="+k);	// false
		System.out.println("I="+i);	// 6(>)  // 7(<)
		System.out.println("J="+j);	// 3(>)  // 4(<)
	}
}
