/*
 * Final Keyword can be use to can not change verible value.
 * final keyword can be use to method this method can not override method
 * final keyword can be use to class,this class can not be inherite class
 
 */


/*final*/ class finalConcept //final keyword can be use to class,this class can not be inherite class
{
   public static void main(String[] args)
   {
	   testw a= new testw();
			 a.te();
   }
   /*final*/  void te()// * final keyword can be use to method this method can not override method
   {
	   System.out.println("hellio");
   }
}
class testw extends finalConcept
{
	public void te()
	{   
		/*final*/int i=10;// * Final Keyword can be use to can not change verible value.
		i=i+10;
		System.out.println(i);
		System.out.println("hi");
	}
}