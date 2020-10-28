import java.util.Scanner;
public class ReversString {

	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter String :");
		String name=sc.next();
		String sa_str=name;
		String rev="";
		int leng=name.length();
		
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		System.out.println(name+" is Revers To "+rev);
      
	   if(sa_str.equals(rev))
	   {
		   System.out.println(name+" is Palindrome String ");
	   }
	   else
	   {
		   System.out.println(name+" is not Palindrome String ");
	   }
	}
}
  