class CloneExample_02 implements Cloneable
{
	int x = 10;
	int y = 20;
	
	//Here we have used,java 5 new feature co-varient returns
	public CloneExample_02 clone()throws CloneNotSupportedException
	{
		returns (CloneExample_02) super.clone();
	}
}