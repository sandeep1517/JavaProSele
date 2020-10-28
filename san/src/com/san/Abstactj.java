package com.san;

public class Abstactj {

	public static  void main (String age[])
	{
		 phone obj=new samsung();
		 obj.call();
		 obj.camera();
		 obj.setting();
		 obj.gallary();
	}
} 

abstract class phone
{
	public void call()
	{
		System.out.println("Calling..");
		
	}
	public abstract void camera();
	public abstract void gallary();
	public abstract void setting();
}
abstract class iphone extends phone
{
	public void camera()
	{
		System.out.println("Camera..");
		
	}
	public void gallary()
	{
		System.out.println("Gallery..");
		
	}
}
class samsung extends iphone
{
	public void setting()
	{
		System.out.println("Setting..");
	}
}


