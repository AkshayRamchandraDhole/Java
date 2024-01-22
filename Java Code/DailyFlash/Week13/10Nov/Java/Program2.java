class Restaurant1{

	class Bank{
	
		class BankAccount{
		
			void inBankAcc(){
			
				System.out.println("In Bank Account Class Method");
			}
		}
		void inBank(){
		
			System.out.println("In Bank Class Method");
		}
	}
	void inRestaurant1(){
	
		System.out.println("In Restaurant1 Class Method");
	}
}
class Main2{

	public static void main(String[] args){
	
		Restaurant1 r = new Restaurant1();
		r.inRestaurant1();
		
		Restaurant1.Bank rb = r.new Bank();
		rb.inBank();
		
		Restaurant1.Bank.BankAccount rbb = rb.new BankAccount();
		rbb.inBankAcc();
	}
}
