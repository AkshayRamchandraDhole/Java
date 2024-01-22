class AngleCheck{

	static void angleCheck(){
	
		int an = 90;

                if(an > 90){

                        System.out.println("Angle is Obtuse:"+an);

                }else if(an == 90){

                        System.out.println("Angle is Right:"+an);
                }else{

                        System.out.println("Angle is Acute:"+an);
                }


	}

	public static void main(String args[]){
	
		//AngleChcek ac = new AngleCheck();
		AngleCheck.angleCheck();

	}
}
