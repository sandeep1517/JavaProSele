public class InterFace {

	public static void main(String a[])
	{
       b obj=new b(); 
         obj.show();
       //obj.display();
	}
}

interface a
{
	 void show();	
} 
class c 
{
	public void show()
	{
		System.out.println("Is InterFace Class A");
	}
}
class b  implements a
{
	public void show()
	{
		System.out.println("Is InterFace Class B");
	}
}