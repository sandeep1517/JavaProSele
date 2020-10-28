public class MarkerInterface 
{
	public static void main(String a[])
	{
		demo obj=new demo();
		if(obj instanceof B)
			  
		{
			obj.show();
		}else
		{
			System.out.println("Error");
		}
	}

}
interface B // Marker Interface
{
	
}

class demo implements B
{
	public void show()
	{
		System.out.println("Hello..");
	}
}
