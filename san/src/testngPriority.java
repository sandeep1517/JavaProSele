import org.testng.annotations.Test;

public class testngPriority 

{
	
	@Test(priority=1)
	public void ts1()
	{
	
		System.out.println("A");
		
	}
    @Test
	public void ts2()
	{
		System.out.println("b");
		
	}
	@Test(priority=-12)
     public void ts3()
    {
    	 System.out.println("c");
 		
    }
}