import java.io.*;
class IPLTeam{

	String teamName;
	String captain;
	int jerseyNum;
	String franchiseOwner;
	int countOfTrophiesWon;
	public static void main(String args[]) throws IOException {
	
		IPLTeam t1 = new IPLTeam();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Team Name:");
		String tName = br.readLine();
		t1.teamName = tName;
		
		System.out.println("Enter Captain Name:");
		String capName = br.readLine();
		t1.captain = capName;
		
		System.out.println("Enter Jersey Number of "+ t1.captain + " : ");
		int jerNum = Integer.parseInt(br.readLine());
		t1.jerseyNum = jerNum;
		
		System.out.println("Enter Franchise Name:");
		String fraName = br.readLine();
		t1.franchiseOwner = fraName;
		
		System.out.println("Enter Count of Trophies Won: ");
		int countTro = Integer.parseInt(br.readLine());
		t1.countOfTrophiesWon = countTro;
		
		System.out.println("Enter Team is Name : "+t1.teamName);
		System.out.println("Enter Captain Name is : "+t1.captain);
		System.out.println("Enter Jersey Number is : "+t1.jerseyNum);
		System.out.println("Enter Franchise Name is : "+t1.franchiseOwner);
		System.out.println("Enter Count of Trophies is : "+t1.countOfTrophiesWon);

	}
}
