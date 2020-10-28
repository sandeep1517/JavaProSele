
/*Fibbonacci Series is last two number addition.
  Fibbonacci Series is :- 0 1 1 2 3 5 8...
  a b c
  0 1 1 2 3 5 8 ..*/

public class fibonacciSeries 
{
	
 public static void main (String agrs[])
 {
	
	 int a=0,b=1;
	 
	 int c;
	 
	 System.out.print("Fibbonacci Series Is : "+a);
	  
	 System.out.print("  "+b);
	  
	 for (int i=1;i<=20;i++)
	 {
		 c=a+b;
		
		 System.out.print(" "+c);
		 
		 a=b;
		 
		 b=c;
		 
	 }
	 
 }
}	

