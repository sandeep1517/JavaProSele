import java.util.Scanner;;
public class ArmstrongNumber {

	
public static void main(String[] args)
  {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number :");
	int no=sc.nextInt();
	int s1=no;
	int temp=0;
	
	while(s1!=0)
	{
		temp=temp+1;
	    s1=s1/10;
	}
	System.out.println(" "+temp+" "+s1);
	int num=no;
	int arm=0;
	while(num!=0)
	{
	     int s2=num%10;
	     System.out.println(s2);
	     int dem=1;
		 for(int i=1;i<=temp;i++)
		 {
			 dem=dem*s2;
		 }
		arm=arm+dem;
		num=num/10;
	}
	if(arm==no)
	{
		System.out.println(no+" is Armstong Number");
	}
	else
	{
		System.out.println(no+" is Not Armstong Number");
		
	}
  }
}
