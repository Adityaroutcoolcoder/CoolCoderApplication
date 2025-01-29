class  Test
{
	public Test(int a){
		this(true,false,100);
		System.out.println("1-arg-constructor");
	}
	public Test(String s1, double d1){
		this(100);
		System.out.println("2-arg-constructor");
	}
	public Test(boolean b1, boolean b2, int b3){
		System.out.println("3-arg-constructor");
	}
	public static void main(String[] args) 
	{
         Test t1 = new Test(100);
         Test t2 = new Test("Aditya",10.2);
	}
}
