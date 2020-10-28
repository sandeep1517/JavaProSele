// 2 3 4 5 6 



import java.util.Scanner;


public class PrimeNo {

	public static void main(String[] args)
	{
		Scanner p= new Scanner(System.in);
		System.out.print("Enter Number :");
		 int no=p.nextInt();
         int temp=0;
         
		  for (int i=2;i<=no-1;i++)
		 {
		    if(no%i==0)
		    {
			 temp=temp+1;
		    } 
		 }
		 if(temp==0)
		 {
			 System.out.println(no+" is Prime Number");
		 }else
		 {
			 System.out.println(no+" is Not Prime Number");
		 }
		  
	   }
	
	}