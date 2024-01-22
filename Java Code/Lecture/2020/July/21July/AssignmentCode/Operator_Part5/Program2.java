class Instagram{

	static boolean update(Instagram obj){

		System.out.println("Static Method of Instagram.....");

		String ans;
		ans = (obj instanceof Instagram) ? "Yes" : "No";
		System.out.println(ans);
		return true;

	}

	boolean privateAccount(){
		System.out.println("Instance Method of Instagram......");
		System.out.println("Account is Private want to see post then follow...");
		return true;
	}

}
class Facebook{

	public static void main(String args[]){
	
		Instagram owner = new Instagram();
		Instagram user = new Instagram();
		boolean res ;
		
		res = (user instanceof Instagram) ? Instagram.update(owner) : user.privateAccount();
		System.out.println(res);
		user.privateAccount();

	}
}
