import java.io.*;
class Program3{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String : ");
		String str1 = br.readLine();
		char[] ch1 = str1.toCharArray();
		
		System.out.println("Enter String : ");
		String str2 = br.readLine();
		char[] ch2 = str2.toCharArray();
		

		boolean check=false;
		int count=0;
		for(int i=0;i<ch1.length;i++){

			if(ch1.length!=ch2.length){
				break;
			}
			for(int j=0;j<ch2.length;j++){
				
				if(ch1[i]==ch2[j]){

					check=true;
					count++;
					break;
					}
				}	

		}
		if(check==true && count==ch1.length || count==ch2.length)
			System.out.println("Both String are anagram");
		else
			System.out.println("Not Anagram");
	}
}
