class LoginWindow{

	String usr = "Akshay";
	String psd = "Ak@180";
	LoginWindow(String usrnm,String pass){
	
		if(usr.equals(usrnm) && psd.equals(pass))
			System.out.println("Login Successful!");
		else
			System.out.println("Invalid User!");
	}
	public static void main(String[] args){
	
		LoginWindow l = new LoginWindow("Aksay","A@180");
	}
}
