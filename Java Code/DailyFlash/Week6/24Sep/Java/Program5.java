import java.io.*;
import java.util.*;
class Program5{

	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = "SWARUP,A,2,324.2";
		String str2 = "SONIA,C,23,522.05";
		int tk1 = 0;
		int tk2 = 0;
		for(int i=0;i<str1.length();i++){
		
			if(str1.charAt(i)==','){
			
				System.out.println();
				tk1 ++;
			}else
				System.out.print(str1.charAt(i));
		}
		System.out.println();

		int j=0;
		while(j!=str2.length()){
		
			if(str2.charAt(j)==','){
			
				System.out.println();
				tk2++;
				
			}else
				System.out.print(str2.charAt(j));
		j++;

		}

		/*for(int i=0;i<str2.length();i++){

                        if(str2.charAt(i)==','){

                                System.out.println();
                                continue;
                        }else
                                System.out.print(str2.charAt(i));
                }*/

		System.out.println();
		System.out.println("Number of Token in "+ str1 + " is : "+ (tk1+1));
		System.out.println("Number of Token in "+ str2 + " is : "+ (tk2+1));

	}
}
