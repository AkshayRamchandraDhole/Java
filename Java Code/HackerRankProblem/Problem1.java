import java.io.*;
class Problem1{
	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iStart = Integer.parseInt(br.readLine());
		int iEnd = Integer.parseInt(br.readLine());
		int evenSum=0,oddSum=0,eCount=0,oCount=0;
		if(iEnd <= iStart){
		
			System.out.println("INVALID INPUT");
		}else{
		
			for(int i=iStart;i<=iEnd;i++){
			
				if(i % 2 == 0){

					evenSum=evenSum+i;
				}else{
				
					oddSum=oddSum+i;
				}
			}
			if(oddSum < evenSum){
			
				for(int i=iStart;i<=iEnd;i++){
				
					if(i % 2 == 0){
					
						System.out.print(i+" ");
						eCount=eCount+1;
						if(eCount % 5 == 0)
							System.out.println();
					}
				}
			}else{
				for(int i=iStart;i<=iEnd;i++){	

					if(i % 2 !=0 ){
						System.out.print(i+" ");
						oCount=oCount+1;
						if(oCount % 5 == 0)
							System.out.println();
					}
			}
				
			}
		}
	}
}

