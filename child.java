class parent
{
    String bullet ="2";
    String car = "2";
 }
    public class child extends parent
 {
    String cycle ="3";

	 public void m1(){
          System.out.println("Cycle riding is my favourite");
 }
    public static void main(String[]args)
 {
    child c = new child();
    System.out.println(c.bullet);
    System.out.println(c.car);
    System.out.println(c.cycle);
    }
 }