package Assesments;

public class Citizen 
{
	///Variables
	private String FName;
	private String LName;
	private char gender;
	private char status;
	private String MName;
	private static int num = 0;
	private static int ppsInc = 1000;
	private int pps;
	
	///Constructors
	public Citizen(String fName, String lName, char gender, int pps, char status, String mName) 
	{
		setFName(FName);
		setLName(LName);
		setGender(gender);
		setStatus(status);
		setMName(MName);
		setPps(ppsInc);
		num ++;
		ppsInc ++;
	}
	
	///Getters & Setters
	public String getFName() 
	{
		return FName;
	}
	public void setFName(String fName) 
	{
		FName = fName;
	}
	public String getLName() 
	{
		return LName;
	}
	public void setLName(String lName) 
	{
		LName = lName;
	}
	public char getGender() 
	{
		return gender;
	}
	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	public char getStatus() 
	{
		return status;
	}
	public void setStatus(char status) 
	{
		this.status = status;
	}
	public String getMName() 
	{
		return MName;
	}
	public void setMName(String mName) 
	{
		MName = mName;
	}
	public int getPps() 
	{
		return pps;
	}

	public void setPps(int pps) 
	{
		this.pps = pps;
	}

	///Misc Methods
	public static int CitizenCount()
	{
		return Citizen.num;
	}

	///toString
	@Override
	public String toString() 
	{
		return "Citizen [FName=" + FName + ", Lname=" + LName + ", gender=" + gender + ", status=" + status + ", MName="
				+ MName + ", num=" + num + "]";
	}
	
}
