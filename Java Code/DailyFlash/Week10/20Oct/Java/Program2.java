import java.util.*;
class Program2{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String st = sc.next();
		System.out.println(st);
		for(int i=0;i<st.length();i++){
			char ch = st.charAt(i);
			if(ch >='A' && ch<='Z'){
				char ch1=(char)((int)ch+32);
				st=st.replace(ch,ch1);
			}else if(ch >='a' && ch<='z'){
				char ch1=(char)((int)ch-32);
				st=st.replace(ch,ch1);
			}
	}
	System.out.println(st);
			
		}
	}
