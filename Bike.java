// Below application shows performing cloning bike pbjects instance

public class Bike implements Cloneable 
{
		private int engineNumber;    // should be initialised by manufacturing company
		private int modelNumber; 	 //should be initialised by manufacturing company
		private String type;		//should be initialised by manufacturing company
		private int bikeNumber;		//should be initialised by RTO
		
		
		public Bike(int engineNumber,int modelNumber,String type)
		{
			this.engineNumber = engineNumber;
			this.modelNumber = modelNumber;
			this.type = type;
		}
		public void setBikeNumber(int bikeNumber)
		{
			this.bikeNumber = bikeNumber;  // RTO office calls this method to set bike number
		}
		
		
		//overriding clone method to develop aboive design
		{
			public Bike clone()throws CloneNotSupportedException
			{
				Bike newBike = (Bike)super.clone();       
				newBike.engineNumber = this.engineNumber + 10; 
				return newBike;		
				}
			public String toString()
			{
				return "Bike Number:"+bikeNumber+"/n"+
						"Engine Number:"+engineNumber+"/n"+	// TO print Object details
						"Model Number:"+modelNumber+"/n"+
						"Type :"+type;
			}
		}
		
}
