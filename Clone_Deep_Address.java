/**
Below program shows developing  deep cloning for student object
*/ 
public class Clone_Deep_Address implements Cloneable
{
	int flatno = 1;
	String colony  = "R.K beach road";
	String city  =  "vizag";
	
	public  Clone_Deep_Address  clone()throws CloneNotSupportedException
	{
		return (Clone_Deep_Address)super.clone();
		
	}
}