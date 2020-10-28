
public class Therad 
{
  public static void main(String a[])throws Exception
  {
	 t obj=new t();
	 d obj1=new d();
	 
	  
	 obj.start();
	 obj1.start();
	 
}
  		
}

class t extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{	
		System.out.println("Hi");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		}
	}
}
class d extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{		
		System.out.println("Sandeep");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		
		}
		
	}
}

