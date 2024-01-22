class Program1{

	public static void main(String[] args){
	
		String[] st = new String[]{"Bobby","Lilly","Arjun","Priti"};
		System.out.println("String Array : ");
		for(int i=0;i<st.length;i++){
		
			System.out.print(st[i]+" ");
		}
		for(int i=0;i<st.length;i++){	
			
			if(st[i]=="Lilly")
				st[i]=st[i].replace("Lilly","Rosh");
		}

		System.out.println("\n After Operation : ");
		for(int i=0;i<st.length;i++){
		
			System.out.println(st[i]);
		}
	}
}
