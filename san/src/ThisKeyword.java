
public class ThisKeyword {

	public static void main(String A[])
	 
	{
		//T obj =new T(5555);
		//obj.show();
		  
		new T(666).show(); //Anonymous Object
	}
}
class T
{
   private int i; //Instance Variable
   
  public T(int i)//local Variable
   {
	   this.i=i;  //Current Instance Variable
   }
   public void show()
   {
	   System.out.print("I is " +i);
   }
}