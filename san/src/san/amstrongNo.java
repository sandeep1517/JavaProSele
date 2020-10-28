package san;

public class amstrongNo {

	public static void main(String ag[])
	{
		
		int n=407;
		int temp=n;
		int r,sum=0;
		
		while(n>0)
		{	
		r=n%10;
		n=n/10;
		sum += r*r*r;
		}
		System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("Its an Amostrong Number");
		}else
		{
			System.out.println("Its an not Amostrong Number");
		}
	}
}
/*
 153
 1*1*1 + 5*5*5 + 3*3*3 
*/