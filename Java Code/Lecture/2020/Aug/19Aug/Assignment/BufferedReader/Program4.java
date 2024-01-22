import java.io.*;
class Program4{

	public static void main(String args[]) throws IOException{
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter First Number:");
		int iNum1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number:");
		int iNum2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Third Number:");
		int iNum3 = Integer.parseInt(br.readLine());
		
		int min,max,mid;
		System.out.println("Descending Order:");
		if(iNum1 > iNum2 && iNum1 > iNum3){
			max=iNum1;
			System.out.print(max+" ");
			if(iNum2 < max  && iNum2 < iNum3){
				mid=iNum3;
				System.out.print(mid+" ");
				min=iNum2;
				System.out.print(min+" ");
			}else{
			
				mid=iNum2;
				System.out.print(mid+" ");
				min=iNum3;
				System.out.print(min+" ");;
			}
		}else if(iNum2 > iNum1 && iNum2 > iNum3){
		
			max=iNum2;
			System.out.print(max+" ");
			if(iNum1 < max  && iNum1 < iNum3){
				mid=iNum3;
				System.out.print(mid+" ");
				min=iNum1;
				System.out.print(min+" ");
			}else{
			
				mid=iNum1;
				System.out.print(mid+" ");
				min=iNum3;
				System.out.print(min+" ");
			}

		}else{
		
			max=iNum3;
			System.out.print(max+" ");
			if(iNum1 < max && iNum1 < iNum2){
				mid=iNum2;
				System.out.print(mid+" ");
				min=iNum1;
				System.out.print(min+" ");
			}else{
			
				mid=iNum1;
				System.out.print(mid+" ");
				min=iNum2;
				System.out.print(min+" ");
			}
		}

		System.out.println();
		System.out.print("Ascending Order:\n");
		 if(iNum1 < iNum2 && iNum1 < iNum3){
                        min=iNum1;
                        System.out.print(min+" ");
                        if(iNum2 > min  && iNum2 > iNum3){
                                mid=iNum3;
                                System.out.print(mid+" ");
                                max=iNum2;
                                System.out.print(max+" ");
                        }else{

                                mid=iNum3;
                                System.out.print(mid+" ");
                                max=iNum2;
                                System.out.print(min+" ");;
                        }
                }else if(iNum2 < iNum1 && iNum2 < iNum3){

                        min=iNum2;
                        System.out.print(min+" ");
                        if(iNum1 > min  && iNum1 > iNum3){
                                mid=iNum3;
                                System.out.print(mid+" ");
                                max=iNum1;
                                System.out.print(max+" ");
                        }else{

                                mid=iNum1;
                                System.out.print(mid+" ");
                                max=iNum3;
                                System.out.print(max+" ");
                        }

                }else{

                        min=iNum3;
                        System.out.print(min+" ");
                        if(iNum1 > min && iNum1 > iNum2){
                                mid=iNum2;
                                System.out.print(mid+" ");
                                max=iNum1;
                                System.out.print(max+" ");
                        }else{

                                mid=iNum1;
                                System.out.print(mid+" ");
                                max=iNum2;
                                System.out.print(max+" ");
                        }
                }

	System.out.println();

	}
}
