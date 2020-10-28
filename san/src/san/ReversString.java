package san;

import java.util.Scanner;

public class ReversString 
{	
   	public void stringP()
	{
   	    System.out.println("Enter StringValu");
   		Scanner St=new Scanner(System.in);
   	    String name=St.next();
   	    String rev="";
      for(int i=name.length()-1;i>=0;i--)
      {
         rev=rev+name.charAt(i);
      }  
      System.out.println(""+rev);
      if(name.equals(rev))
      {
    	  System.out.println("Is Palindrom");
      }
      else
      {
    	  System.out.println("Is Not Palindrom");
      }
	}
   	public void inValu()
   	{
  	    System.out.println("Enter IntegerValu");
  	  
   	    Scanner in=new Scanner(System.in);
   	    int num=in.nextInt();
   		int temp=num;
   		int re,pr=0;
   	    while(temp!=0)
   	    {
   	    	re=temp%10;
   	    	pr=pr*10+re;
   	    	temp=temp/10;
   	    }
   	    System.out.println(""+pr);
   	    if(pr==num)
   	    {
   	    	System.out.println("is palindrom num");
   	    }
   	    else
   	    {
   	    	System.out.println("is not palindrom num");
   	    }
   	
   	}
   	

public static void main(String arg[])
{
    ReversString st=new ReversString();
    st.stringP();
    st.inValu();
	
}
}
