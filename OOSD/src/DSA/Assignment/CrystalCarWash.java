package DSA.Assignment;

import java.util.Scanner;

public class CrystalCarWash 
{
	public static void main(String[] args) 
	{
		
	int choice;
	Scanner in = new Scanner(System.in);
	Car[] cars = new Car[0];
	Car[] temp;
	

	do
	{	//menu system for the user to input what needed							
		System.out.println("\nPlease select one of the following options:");
		System.out.println("1. Add a car to the waiting list.");
		System.out.println("2. Show how many cars are in the waiting list.");
		System.out.println("3. Show the details of all cars in waiting list.");
		System.out.println("4. Remove a car from the waiting list.");
		System.out.println("5. Show the details of the next car to be washed.");
		System.out.println("6. Remove all cars from the list on a given wash type.");
		System.out.println("7. End the programme.");
		choice = in.nextInt();
		
		if(choice==1) 
		{
			in.nextLine();
			String name;
			String washType;
			System.out.println("Please enter the driver's name: ");
			name = in.nextLine();
			
			System.out.println("Please enter the wash type required: ");
			washType = in.nextLine();
			
			Car details = new Car(name,washType); //Uses object created in Car.java
			
			temp = new Car[cars.length+1]; //temporary variable so we can dynamically increase array size
			
			for(int i=0;i<cars.length;i++) 
			{
				temp[i] = cars[i]; 		
			}
			
			temp[cars.length]=details;
			
			cars=temp;	//assigns the temporary details into our cars array
			
			System.out.println("This car has been added to the waiting list!");
			}
		
		else if(choice==2) 
		{
			System.out.println("There are " + cars.length + " car(s) in the queue."); //as we are changing the cars length with each addition and subtraction this is a suitable variable
		}
		
		else if(choice==3) 
		{
			if(cars.length==0) 
			{
				System.out.println("There are currently no cars in the waiting list.");
			}
			else {
				System.out.println("The details of the cars in queue are: ");
				for(int i=0;i<cars.length;i++) {
					System.out.println(cars[i]);	//will print out each use of object currently within array
				}
			} 
		}
		
		else if(choice==4) 
		{
			if(cars.length==0) 
			{
				System.out.println("The waiting list was already empty.");
			}
			else {
			temp = new Car[cars.length-1];
			for(int i=0;i<temp.length;i++) 
			{
				temp[i] = cars[i+1];			//must transfer to a new temp as we need all parts after the given section.
			}
			cars=temp;
			System.out.println("The next car in waiting list has been removed from queue!");
		}
		}
		
		else if(choice==5) 
		{
			if(cars.length==0) 
			{
				System.out.println("There are currently no cars in the waiting list.");
			}
			else 
			{
				System.out.println("The details of the next car to be washed is: " + cars[0]);	//The car at 0 in the array will always be the next car to be washed.
			}
		}
		
		else if(choice==6) 
		{
			if(cars.length==0) 
			{
				System.out.println("There are already no cars in the waiting list");
			}
			else 
			{
				in.nextLine();
			
				String washTypeClear;
			
				System.out.println("Enter the wash type to be cleared: ");
				washTypeClear = in.nextLine();
			
				for(int i=0;i<cars.length;i++) 
				{
					temp = new Car[cars.length-1]; //length gets lowers by one here
					if(cars[i].getWashType().equalsIgnoreCase(washTypeClear)) 
					{
						for(int y=i;y<temp.length;y++) 
						{
							temp[y] = cars[y+1];
						}
						for(int x=0;x<i;x++) 
						{
							temp[x] = cars[x];
						}
						cars = temp; //car length is then given a lower size here
						i--; //i needs to be reset which each running of the for loop as variables get altered each time
					}
				}
				System.out.println("All cars that were under " + washTypeClear + " have been removed from the waiting list");
			}
		}
		else if(choice<=1) 
		{
			System.out.println("This is not a valid option!"); //Must make this option as otherwise would get an error
		}
		else if(choice>=8) 
		{
			System.out.println("This is not a valid option!");
		}
	}
	while(choice!=7);
	System.out.println("Goodbye!"); //Confirmation of ending.
	in.close();
	}
}
