 class Clone_Deep_Student implements Cloneable
{
	int sno = 1;
	String sname = "StudentOne";
	String course = "Course1";
	double fee = 1000;
	Clone_Deep_Address add = new Clone_Deep_Address();
	
	public Clone_Deep_Student clone()throws CloneNotSupportedException
	{	
		Clone_Deep_Student s = (Clone_Deep_Student)super.clone();
		s.add = this.add.clone();
		return s;
		
	}


	public static void main(String[] args)throws CloneNotSupportedException
	{	
		Clone_Deep_Student s1 = new Clone_Deep_Student();
		Clone_Deep_Student s2 = (Clone_Deep_Student)s1.clone();
		System.out.println(s1.add==s2.add); // false
		
	}
}