class Clone_D extends Clone_C implements Cloneable
{
	int s = 8;
	public String toString()
	{
		return "p:"+p+"\n"+
				"q:"+q+"\n"+
				"r:"+r+"\n"+
				"s:"+s;
				
	}
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Clone_D d1= new Clone_D();
		Clone_D d2 = (Clone_D)d1.clone();
		
		System.out.println("d1 object data\n"+d1);
		System.out.println("d2 Object data]n"+d2);
		
		d2.p  = 12;
		d2.q = 13;
		d2.r = 14;
		d2.s = 15;
		
		System.out.println("\nAfter Modification");
		System.out.println("d1 object data\n"+d1);
		System.out.println("d2 obeject data\n"+d2);
		
		
	}
	
}