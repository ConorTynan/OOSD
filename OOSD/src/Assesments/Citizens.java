package Assesments;

import java.util.Scanner;
public class Citizens 
{
	public static void main(String[] args)
	{
		Citizen[] citizens = new Citizen[3];
		Scanner input=new Scanner(System.in);
		for (int i=0;i<=2;i++)
		{	///allows user to input details
			System.out.println("Enter First Name:");
			String FName=input.nextLine();
			System.out.println("Enter Last Name:");
			String LName=input.nextLine();
			System.out.println("Enter gender(M/F):");
			char gender=input.next().charAt(0);
			System.out.println("Enter Marital Status(M/S):");
			char status=input.next().charAt(0);
			input.nextLine();
			String MName;
			if(gender == 'F' && status == 'M' || gender == 'f' && status == 'm') 
			{
	            System.out.println("Enter Maiden Name:");
				MName=input.nextLine();
	        }
			else
			{
				MName = "N/A";
			}
			
			Citizen c=new Citizen(FName, LName, gender, status, status, MName);
			citizens[i]=c;
			System.out.println("Number of Citizens: " + Citizen.CitizenCount());
		}
		for(Citizen c:citizens)
		{
			if(c!=null)System.out.println(c.toString());
		}
		input.close();
	}
}
