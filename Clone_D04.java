class Clone_D04 extends Clone_C03 implements Cloneable
{
	Clone_B02 b1 = new Clone_B02();
	public static void main (String[] args)
	{
		Clone_D04 d1 = new Clone_D04();
		Clone_D04 d2 = (Clone_D04)d1.clone();
		
		System.out.println(d1.a==d2.a);
		System.out.println(d1.b==d2.b);
			
		d1.a = new Clone_A01();
		d1.b = new Clone_B02();
	
		System.out.println(d1.a==d2.a);
		System.out.println(d1.b==d2.b);
		
	
	}
}