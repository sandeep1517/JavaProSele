package com.san;

public class swapNo 
{
	public static void main(String arg[])
{
	   int  spac=4,star=1;
	   for(int i=1;i<=10;i++)
	   {
		   System.out.println();
		   
		  for(int j=1;j<=spac;j++)
		    {  System.out.print(" ");}
		     
		   for(int k=1;k<=star;k++)
		    { System.out.print("*");}
		if(i<5)
		{	
		 spac--; 
		 star=star+2;
		}
		else
		{
			spac++;
			star=star-2;
			
		}
		
	   }
}
}	
	

