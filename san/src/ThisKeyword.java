
public class ThisKeyword {

	public static void main(String A[])
	 
	{
		//T obj =new T(5555);
		//obj.show();
		  
		new Tp(666).show(); //Anonymous Object
	}
}
class Tp
{
   private int i; //Instance Variable
   
  public Tp(int i)//local Variable
   {
	   this.i=i;  //Current Instance Variable
   }
   public void show()
   {
	   System.out.print("I is " +i);
   }
}