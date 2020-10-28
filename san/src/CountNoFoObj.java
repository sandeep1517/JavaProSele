
		class A
		{
			static int i=0;
			public A()
			{
			   i++;
			   
			}
			
		public void counter()
		{
     		System.out.println(i);
     		
		}   
	

	public static void main ()
	{
		
	    A obj1 =new A();
	    A obj2 =new A();
	    A obj3 =new A();
	    obj3.counter();
	    
	}

		}
