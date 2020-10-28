//Wrapper

//int ,float,double,char Is a Permeative Value
//Integer,Float ,character is A class 
public class Wrapper {

	public static void main(String a[])
	{
		int i = 6;
		
		Integer ii=new Integer(i); //Boxing Warapper
		Integer jj=i;              //AutoBoxing 
		
		int j =jj.intValue();      //Unboxing
		int k =jj;                 //AutoUnBoxing
		System.out.println(k  );
		 
	}
}

