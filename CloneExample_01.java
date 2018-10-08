class CloneExample_01 implements Cloneable 
{
	int x = 10;
	int y = 20;
	public static void main(String[] args)throws CloneNotSupportedException
	{
		CloneExample_01 ex1 = new CloneExample_01();
		ex1.x = 5;
		ex1.y = 5;
		CloneExample_01 ex2 = new CloneExample_01();
		
		System.out.println(ex1==ex2);
		System.out.println(ex1.hashCode()==ex2.hashCode());
		
		System.out.println(ex1.x+"..."+ex1.y);
		System.out.println(ex2.x+"...."+ex2.y);
		
		ex2.x = 8;
		ex2.y = 9;
		
		System.out.println();
		System.out.println(ex1.x+"..."+ex1.y);
		System.out.println(ex2.x+"..."+ex2.y);
	}
}