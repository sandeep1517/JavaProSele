package san;

public class fibbo {

	public static void main(String agr[])
	{
		int a=1,b=1,c;
		c=0;
		System.out.print("1 1 ");
		while(c<=500)
		{
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		}
	}
}
