package com.san;

public class Inheretance {

	public static void main(String a[])
	{
	    Su obj=new Su();
	    obj.a=88;
	    obj.b=3;
	    obj.Add();
	    System.out.println(obj.c);
	    obj.sub();
	    System.out.println(obj.c);
	     
	}
	
  }
class Add 
{
	int a,b,c;
	
	public void Add()
	{
	  c=a+b;
	}
}
class Su extends Add    // Single Level Inheretance
{
	
	public void sub()
	{
		c=a-b;
	}
}	
class mu extends Su //Multi leve Inheritance
{
	public void mu()
	{
		c=a*b;
	}
}
  