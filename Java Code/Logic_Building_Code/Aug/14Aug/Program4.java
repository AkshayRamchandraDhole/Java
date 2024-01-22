class FloatVar{

	public static void main(String args[]){
	
		float i=0.0f;
		float j=0.0f;
		System.out.println("i \t j");
		for(int n=0;n<10;n++){
		
			//System.out.println(i+"\t"+j);
			System.out.printf("%.2f\t",i);
			System.out.printf("%.2f\n",j);
			i+=0.20;
			j-=0.20;
		}
	}
}
