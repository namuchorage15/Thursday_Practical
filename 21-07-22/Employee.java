package Mine;

public class Employee {
	String Name;
	int Year;
	int Salary;
	String Address;
	
	Employee(String name,int years,int salary, String addr)
	{
		Name=name;
		Year=years;
		Salary=salary;
		Address=addr;
   	}
	public void Robert()
	{
		System.out.println(Name+" "+Year+" "+Salary+" "+Address);
	}

	public void Sam()
	{
		System.out.println(Name+" "+Year+" "+Salary+" "+Address);
	}

	public void John()
	{
		System.out.println(Name+" "+Year+" "+Salary+" "+Address);
	}
}


