package Lab1;

// Student Name 	: Conor Tynan
// Student Id Number: C00251886
// Date 			: Oct-2020
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		Thermometer thermB=new Thermometer(10.0);
		double tempB=thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is "+tempB);
		tempB=thermB.getFahrenheit();
		System.out.println("Temp. of Thermometer B is "+tempB);
		thermB.setFahrenheit(100);
		tempB=thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is "+tempB);
		
	} // end main
} // end cl