class Dev{

	public static void main(String args[]){
	
		Dev ShirRam = new Dev();

		Dev ShriKrishna = new Dev();
		
		Dev Apan = null;

		Dev Tumhi = null;

		boolean ans ;

		ans = ShirRam instanceof Dev;
		System.out.println("ShriRam is Instance of Dev:"+ans);
		
		ans = ShriKrishna instanceof Dev;
		System.out.println("ShriKrishna is Instance of Dev:"+ans);
		
		ans = Apan instanceof Dev;
		System.out.println("Apan is Instance of Dev:"+ans);
		
		ans = Tumhi instanceof Dev;
		System.out.println("Tumhi is Instance of Dev:"+ans);

	}
}
