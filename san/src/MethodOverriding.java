class xyb
{
	public void show(int a)
	{
	  System.out.println("hello");
	}
}
class MethodOverriding extends xyb
{
	public void show(String s)
	{
		System.out.println("hi ");

	}
	public static void main(String arg[])
	{

		 MethodOverriding h=new MethodOverriding();
		 h.show("s");
		 xyb n=new xyb();
		 n.show(0);
		  
	}
}