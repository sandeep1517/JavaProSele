/*
 * super keyword can use to Parent class instance verible
 * this keyword can use to current class instance verible
 * 
 */

public class superKeyworkconcept
{
  public static void main(String[] arg)
  {
	  
	  
	  System.out.println("");
	  abw aa=new abw();
	  aa.show(30);
  }
}
class as
{
	int a=10;
	
}
class abw extends as
{
	int a=20;
	void show(int a)
	{
		System.out.println(super.a); //super keyword can use to Parent class instance verible
		System.out.println(this.a);//this keyword can use to current class instance verible
		System.out.println(""+a);
	}
}