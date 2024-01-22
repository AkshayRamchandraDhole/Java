class StateCapital{

	String capital;
	String state;

	StateCapital(String state,String capital){
	
		this.state=state;
		this.capital=capital;
	}
}
class UserObjectArray{

	public static void main(String[] args){
	
		StateCapital obj1 = new StateCapital("Maharashtra","Mumbai");
		StateCapital obj2 = new StateCapital("Goa","Panji");
		StateCapital obj3 = new StateCapital("Bihar","Patna");
		StateCapital obj4 = new StateCapital("Jharkhadh","Chennai");
		StateCapital obj5 = new StateCapital("Karnataka","Banglore");

		StateCapital sc[] = new StateCapital[]{obj1,obj2,obj3,obj4,obj5};
		for(int i=0;i<sc.length;i++){
		
			System.out.println(sc[i].state+":"+sc[i].capital);
		}
	}
}
