

public class PolyMorphismOverloading
{
	
	public static void main (String a[])
	
	{
		Ab obj=new Ab();
		obj.show(5);
	}

}

class Ab  // Method Overloading ,Early Binding ,static Binding,Compile Time Polym

{
	public void show()
	{
		System.out.println("Hello World");
		
	}
	public void show(int i)
	{
		System.out.println("Hello World With ParaMeters");
	}
}
