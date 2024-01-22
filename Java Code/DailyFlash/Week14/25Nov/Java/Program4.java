import java.util.*;
class Gym{

	class Day0{
	
		void workOutPlan(){
		
			System.out.println("Black");
		}
	}
	class Day1{
	
		void workOutPlan(){
		
			System.out.println("Shoulder");
		}

	}
	class Day2{
	
		void workOutPlan(){
		
			System.out.println("Thighs");
		}

	}
	class Day3{
	
		void workOutPlan(){
		
			System.out.println("Legs");
		}

	}
	class Day4{
	
		void workOutPlan(){
		
			System.out.println("WarmUp");
		}

	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 0 to 4");
		int input=sc.nextInt();
		switch(input){
		
			case 0 :
				new Gym().new Day0().workOutPlan();
			break;
			
			case 1 :
				new Gym().new Day1().workOutPlan();
			break;
			
			case 2 :
				new Gym().new Day2().workOutPlan();
			break;
			
			case 3 :
				new Gym().new Day3().workOutPlan();
			break;
			
			case 4 :
				new Gym().new Day4().workOutPlan();
			break;
		}
	}
}
