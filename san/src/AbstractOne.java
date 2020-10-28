
public class AbstractOne 
{
  public static void main(String a[])
  {
	  xy obj=new xy();
	  abc obj1 =new abc();
	  show(obj1);
  }
  public static void show(abc obj)
  {
	  obj.show();
  }
}
abstract class p
{
	public abstract void show();
}
 class abc extends p
 {
	 public void show()
	 {
		 System.out.println("Hi Abstract");
	 }
 }
 class xy extends abc
 {
	 public void show()
	 {
		 System.out.println("Hi Abstract SubClass");
		 
	 }
 }