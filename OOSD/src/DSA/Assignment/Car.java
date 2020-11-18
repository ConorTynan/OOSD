package DSA.Assignment;

public class Car
{
		//Variables
		private String name;
		private String washType;
		
		//Constructors
		public Car(String name, String washType) 
		{
			setName(name);
			setWashType(washType);
		}
	
		//Getters & Setters
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getWashType()
		{
			return washType;
		}
		public void setWashType(String washType)
		{
			this.washType = washType;
		}
		
		//toString
		@Override
		public String toString()
		{
			return "Driver's name: " + name + " wash type they require is: " + washType ;
		}
}
