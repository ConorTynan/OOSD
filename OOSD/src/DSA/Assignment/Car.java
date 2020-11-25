package DSA.Assignment;

public class Car 
{
	
	//variables
	private String name;
	private String washType;
	//constructors
	public Car(String name, String washType) 
	{
		setName(name);
		setWashType(washType);
	}
	//getters&setters
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
		return "Driver's name: " + name + "/nThe wash type they require is: " + washType ;
	}
}
