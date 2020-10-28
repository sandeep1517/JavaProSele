package san;

import java.util.Scanner;

public class palindromProgram {

	public static void main(String[] args) 
	{
	
	 System.out.println("Enter Number==>>");
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int temp=number;
      int rem,rev=0;
      
      while(temp!=0)
      {
    	  rem=temp%10;
    	  rev=rev*10+rem;
    	  temp=temp/10;
    	  System.out.println(""+rem);
          System.out.println(""+rev);
      
     }
      if (rev==number)
      {
    	System.out.println("is Palindrom");
    	  
      }
      else
      {
    	  System.out.println("Is Not palindrom");
      }
      
	}

}
