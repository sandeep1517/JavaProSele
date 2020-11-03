public class InterFace {

	public static void main(String a[])
	{
       b obj=new b(); 
         obj.show();
       //obj.display();
	}
}

interface at
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
class b  implements at
{
	public void show()
	{
		System.out.println("Is InterFace Class B");
	}
}