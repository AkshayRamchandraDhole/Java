class Material{

	double price=0.0;
	Material(String matrialName,double price){
	
		System.out.println("Material Name : "+matrialName);
		this.price=price;
		System.out.println("Price : "+price);

	}
	public static void main(String[] args){
	
		Material ironRod = new Material("IronRod",66700.0);
		Material cement = new Material("Cement",56999.0);
		Material bricks = new Material("Bricks",46444.0);

		System.out.println("Total Price : "+(ironRod.price+cement.price+bricks.price));
	}
}
