
public class SuperKeyWord {

	public static void main(String a[])
	{
		y s=new y();
		s.show();
		s.show(2);
	} 
}

class x 
{
	public void show()
	{
		System.out.println("In Const X");
		
	}
	public void show(int i)
	{
	
		System.out.println("In Const X With Para");
		
	}
}
class y extends x
{
	

	public void show()
	{
        super.show();
        super.show(0);       
		System.out.println("In Const Y");
	}
	public void show(int i)
	{
		
		System.out.println("In Const Y with Para");
	}
}