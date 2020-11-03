public class MarkerInterface 
{
	public static void main(String[] args)
	{
		demo obj=new demo();
		if(obj instanceof Bt)
			  
		{
			obj.show();
		}else
		{
			System.out.println("Error");
		}
	}

}
interface Bt // Marker Interface
{
	
}

class demo implements Bt
{
	public void show()
	{
		System.out.println("Hello..");
	}
}
