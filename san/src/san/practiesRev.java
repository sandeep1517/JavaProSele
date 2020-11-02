package san;

import java.util.Scanner;

public class practiesRev {

	public static void main(String [] arg)
	{
	   practiesRev s=new practiesRev();
	   s.amstrong();
	  // s.fibbo();
		
//	   System.out.println("Enter String===");
//		
//	   Scanner sr=new Scanner(System.in);
//	  
//	   String name=sr.next();
//		
//		String rev="";
//		
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			
//			rev=rev+name.charAt(i);
//			
//		}
//		
//		System.out.println(rev);
//		
//		
//		if(name.equals(rev))
//		{
//			System.out.println("is Palindrom");
//		}
//		else
//		{
//			System.out.println("Is Not Palindrom");
//		}
//		
	}
	
	public void fibbo()
	{
	 
		System.out.println("Enter No====>>");
		 
    	Scanner num=new Scanner(System.in);	
	 
	 int no=num.nextInt();
	 
	 int a=0 ,b=1;

	 System.out.print("Fibbonaci Series :"+a);
	 
	 System.out.print(" "+b);
	   
	 int c;
	 for(int i=1;i<=no;i++)
	 {
		 c=a+b;
		 System.out.print(" "+c);
		 a=b;	
		 b=c;
	 }
	}
	 public void amstrong()
	 {
		System.out.println("enter");
	   Scanner st=new Scanner(System.in);
	   int temp=st.nextInt();
	   int s1=temp;
	   while(temp!=0)
	   {
		   temp=temp%10;
		   
	   }
		
	   System.out.println("");
	 }
	
}

	 

