public class Factory
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Bike b1 = new Bike(1234,2019,"pulsur 250 cc");
		
		Bike b2 = (Bike)b1.clone();   //cloning first bike object
		System.out.println(b1==b2);		//clone() method creates new object, so == returns false 
		
		b1.setBikeNumber(8192);		//setting bike number
		b2.setBikeNumber(8193);
		
		System.out.println("b1 object details");
		System.out.println(b1);
		
		System.out.println();
		System.out.println("b2 object details");
		System.out.println(b2);
		
	}
}