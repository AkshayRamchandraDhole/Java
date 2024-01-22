class InVal{

	static int k;
	int a;
	byte b;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean bl;

	public static void main(String args[]){

		System.out.println("Static value="+k);
		
		InVal v=new InVal();
		System.out.println("Byte="+v.b);
		System.out.println("Short="+v.s);
		System.out.println("Int="+v.a);
		System.out.println("Long="+v.l);
		System.out.println("Float="+v.f);
		System.out.println("Double="+v.d);
		System.out.println("Char="+v.c);
		System.out.println("Boolean="+v.bl);
	}

}
