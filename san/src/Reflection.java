
public class Reflection 
{

	public static void main(String A[]) throws Exception
	{
	
		Class c= Class.forName("com.sandeep.l");
	  
		System.out.println(c.getSuperclass());
	
	
	}
}
