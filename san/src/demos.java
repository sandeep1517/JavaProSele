
public class demos{
	
	public static void main(String A[])
	{
		cp obj =new z();
		cp obj1=new i();
		obj1.display();
		obj.display();
		
	}
}
interface cp
{
	public void display();
	
}
class i implements cp
{

	public void display()
	{
		for(int i=0;i<=8;i++)
		{
			System.out.println("Interface B Is: "+i);
        }
		System.out.println("");
		
	}
	
}
class z extends i
{

	public void display()
	{
		for(int i=0;i<=8;i++)
		{
			System.out.println("Interface T Is: "+i);
		}
	}
	
}
