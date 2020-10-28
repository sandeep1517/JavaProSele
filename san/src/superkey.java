
class  xyzb 
{
      public void show()
      {
	     System.out.println("1");
      }
}
class superkey extends xyzb
{
	public void show()
	{
		super.show();
		System.out.println("2");
	}
	
	public static void main(String [] arg)
	{
		superkey f=new superkey();
		f.show();
	}
}

