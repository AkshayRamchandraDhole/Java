import java.util.*;
import java.io.*;
class PropertiesDemo{
	
	public static void main(String[] args) throws IOException{
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("carnumber.properties");
		p.load(fis);
		System.out.println(p);
	
		p.setProperty("Akshay","6598");
		FileOutputStream fos = new FileOutputStream("carnumber.properties");
	
		p.store(fos,"Updated by Akshay");
		System.out.println(p);
	}
}
