
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class demot {

	public static void main(String a[])
   {
		
   
	long t =System.currentTimeMillis();
	
	System.out.println(t);
		
	ArrayList<String> name = new ArrayList<>();
	name.add("Sandeep");
	name.add("Sudhir");
	name.add("Pankaj");
    name.add("Sudhir");
    name.add("Pankaj");
    
   Set<String> s= new HashSet<>();
    
	for(String names :name)
	{
	     if(s.add(names)==false)
	
	     System.out.println(names);
	}     
	
  }
}
