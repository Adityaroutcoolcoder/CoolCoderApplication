class Aditya10 
{
	String sname = "Rajashree Rout";

	public void m1(){
		System.out.println("She is my sister");
	}
}
     public class Aditya20 extends Aditya10
    {
		String bname = "Jyoti prakash Nayak";

			public void m2(){
		System.out.println("He is my Brother");
	
    }
	public static void main(String[] args)
	{
		Aditya20 a = new Aditya20();
		System.out.println(a.sname);
		System.out.println(a.bname);
		a.m1();
		a.m2();
	}
}
