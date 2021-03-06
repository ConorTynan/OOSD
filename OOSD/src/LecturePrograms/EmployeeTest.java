package LecturePrograms;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		System.out. println ( "Employees before instantiation : " + Employee.getCount());
		
		Employee e1 = new Employee( "Susan", "Baker" );
		Employee e2 = new Employee( "Bob", "Jones" );
		System.out. println ( "Employees after instantiation : " + Employee.getCount());
		
		System.out. println ( "Employee 1: " + e1.getFName() + " " + e1.getLName());
		System.out. println ( "Employee 2: " + e2.getFName() + " " + e2.getLName());
		e1 = null ;
		e2 = null ;
		
		System.gc(); // explicit call to garbage collector
		System.out. println ( "Employees after garbage collection : " + Employee.getCount() );
	}
}
