package LecturePrograms;

public class Employee
{
	//Variables
	private String fname;
	private String lname;
	private static int count; //no. of objects instantiated
		
	//Constructors
	public Employee() 
	{
		setFName("");
		setLName("");
		++count;
	}

	public Employee(String fname, String lname) 
	{
		setFName(fname);
		setLName(lname);
		++count;
	}

	//Getters & Setters
	public String getFName() 
	{
		return fname;
	}

	public void setFName(String fname) 
	{
			this.fname = fname;
	}

	public String getLName()
	{
		return lname;
	}

	public void setLName(String lname)
	{
			this.lname = lname;
	}

	public static int getCount() 
	{
		return count;
	}

	//toString
	@Override
	public String toString()
	{
		return "Employee [fname=" + fname + ", lname=" + lname + "]";
	}
		
	//Finalize
	public void finalize()
	{
		--count;
	}
}
