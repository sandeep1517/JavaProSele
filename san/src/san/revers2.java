package san;

import java.util.Scanner;

public class revers2 {

	public  void Show() {
	    System.out.println("Enter String =====>>");
		Scanner sr=new Scanner(System.in);
		String name=sr.next();
	    String rev ="";
	    
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.print("Revers String===>>"+rev);
		
		if(name.equals(rev))
		{
			System.out.println("   IS Palindrom String");
		}
		else
		{
			
			System.out.println("   IS Not Palindrom String");
		}
	}

	public void showin()
	{
		System.out.println("Enter Number==>");
		Scanner sn=new Scanner(System.in);
		int num=sn.nextInt();
	    int temp=num;
	    int rev,rem=0;
	    while(temp!=0)
	    {
	    	rev=temp%10;
	        rem=rem*10+rev;
	        temp=temp/10;
	        
	    }
	    System.out.println(""+rem);
	   if(rem==num)
	   {
		   System.out.println("is palindrom number");
	   }
	   else
	   {
		   System.out.println("is not palindrom number");
	   }
	}


public static void main(String[] args)
{
	revers2 ne=new revers2();
	ne.showin();
	ne.Show();
	
}
}
