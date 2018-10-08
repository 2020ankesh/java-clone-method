/**Programming rule in calling clone() method
	1.because clone() method is protected, it can be called on a class object only inside that class.
	If we call it in other classes including in subclass it leads to CE.To call it from other classes 
	we must override clone() in that subclass with public keyword.
	2. Beacuse it is returning that object as java.lang.Object type.
	We must cast the clone() method returned object to its current object class. */

class CloneExample implements Cloneable
{
	int x = 10;
	int y = 20;
	public static void main(String[] args)throws CloneNotSupportedException
	{
		CloneExample ex1= new CloneExample();
			CloneExample ex2 = (CloneExample)ex1.clone();
	}
}
 