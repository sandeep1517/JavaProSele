 import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {

	public static  void main(String a[])
	{
	    
		List<Student> studs=new ArrayList<Student>();
		studs.add(new Student(1,55));
		studs.add(new Student(2,85));
		studs.add(new Student(4,65));
		studs.add(new Student(5,88));
		studs.add(new Student(6,45));
		
		
		for(Student s:studs)
		{
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Student
{ 
	int rollno;
	int mrks;
	public Student(int rollno, int mrks) {
		
		this.rollno = rollno;
		this.mrks = mrks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", mrks=" + mrks + "]";
	}
	
	
}