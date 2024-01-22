import java.io.*;
class InputDemo1{

	public static void main(String args[]) throws IOException{
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//System.out.println(br.readLine());
		
		String input1 = br.readLine();
		System.out.println(input1);
		
		String input2 = br.readLine();
		System.out.println(input2);

		//br.close();

		//isr.close();
		
		 br.close();
		/* br.readLine(); //Exception in thread "main" java.io.IOException: Stream closed
						at java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
						at java.io.BufferedReader.readLine(BufferedReader.java:317)
						at java.io.BufferedReader.readLine(BufferedReader.java:389)
						at InputDemo1.main(Input1.java:17) 
		*/

		/*br.readLine();
		 *
		 * Exception in thread "main" java.io.IOException: Stream closed
	at sun.nio.cs.StreamDecoder.ensureOpen(StreamDecoder.java:46)
	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:148)
	at java.io.InputStreamReader.read(InputStreamReader.java:184)
	at java.io.BufferedReader.fill(BufferedReader.java:161)
	at java.io.BufferedReader.readLine(BufferedReader.java:324)
	at java.io.BufferedReader.readLine(BufferedReader.java:389)
	at InputDemo1.main(Input1.java:30)

		 *
		 *
		 */
		
		//br.readLine();

	//	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	       	//System.out.println(br1.readLine());
		 
	/*	br1.readLine();	
			Exception in thread "main" java.io.IOException: Stream closed
	at java.io.BufferedInputStream.getBufIfOpen(BufferedInputStream.java:170)
	at java.io.BufferedInputStream.read(BufferedInputStream.java:336)
	at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
	at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
	at java.io.InputStreamReader.read(InputStreamReader.java:184)
	at java.io.BufferedReader.fill(BufferedReader.java:161)
	at java.io.BufferedReader.readLine(BufferedReader.java:324)
	at java.io.BufferedReader.readLine(BufferedReader.java:389)
	at InputDemo1.main(Input1.java:51)

	*/
	}	
}
