class Program3{

	public static void main(String[] args){
	
		float[] arr1 = {15.0f,30.0f,55.0f,34.0f,21.0f};
		float sum=0.0f;
		for(int i=0;i<5;i++){
			sum+=arr1[i];
		}
		System.out.println("Avg of Array is : "+(sum/5));
	}
}
