class NestedSwitch{

	public static void main(String args[]){
	
		int floor = 2 ;
		switch(floor){
		
			case 1 :
				{
					char ch = 'S';

					switch(ch){
					case 'S':
					case 's':
						System.out.println("Shopping....");
					break;
					
					case 'F':
					case 'f':
						System.out.println("Nusta Khaych...");
					break;
					default :
					 	System.out.println("Service Not Available....");
					break;
					}
				
				}
			break;
			
			case 2 :
				{
					char ch = 'p';
					switch(ch){
					
						case 'M':
						case 'm':
							System.out.println("Dil Bechara	: Movie");
						break;

						case 'P':
						case 'p':
							System.out.println("Football");
						break;

						default :
							System.out.println("Service Not Available");
						break;
					}	

				}
			break;
		}
	}
}
