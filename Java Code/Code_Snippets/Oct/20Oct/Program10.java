class Animals{

	String animalName;

	Animals(String animalName){
	
		this.animalName=animalName;
	}
}

class Core2web{

	public static void main(String[] args){
	
		Animals []arr={new Animals("Tiger"),new Animals("Lion")};
		System.out.println(arr[0]);
	}
}
