
public class MethodOverloadinga 
{

	public void show(String a)
	{
		
		System.out.println("=====Hello Sandeep==== ");
	}
	public void show(int a)
	{
		System.out.println("======Hi sandeep======");
	}

	public static void main(String a[])
	{
		MethodOverloadinga data=new MethodOverloadinga();
		data.show(5);
	
	}
}
