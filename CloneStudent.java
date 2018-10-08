

/** Below program shows the developing shallow cloning */
public class CloneShallow_Student implements Cloneable
{
	int sno = 1;
	String sname = "StudentOne";
	String course = "Course1";
	double fee = 1000;
	CloneShallowAddress add = new CloneShallowAddress();
	
	public static void main(String[] args)throws CloneNotSupportedException
	{	
		CloneShallow_Student s1 = new CloneShallow_Student();
		CloneShallow_Student s2 = (CloneShallow_Student)s1.clone();
		System.out.println(s1.add==s2.add);
		
	}
}