
public class PolyMethodOverriding {
	public static void main(String ag[])

	{
		pqr obj=new pqr();
		obj.show();
	}
}

class xyz //Method Overriding,Dynamic Binding,late Binding
{
 public void show()
 {
	 System.out.println("Overriding Xyz Class");
	 
 }
}
class pqr extends xyz
{
	public void show()
	{
	 System.out.println("Overriding Pqr Class");	
	}
}