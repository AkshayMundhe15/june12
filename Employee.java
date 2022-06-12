/* Q2.Create a class Employee(empid,empname,basicSalary)
Write constructor,toString(),getter and setter method.
and also add calculateSalary() which calculate salary with incentive
where in incentaive is 1000rs for all employees.
public class Employee */

class Employee
{
	private String empid;
	private String empname;
	private int basicSalary;
	private int finalSalary;
	
//creating constructor with parameters
	
	public Employee(String name, String id, int salary)
	{
		empname = name;
		empid = id;
		basicSalary = salary;
	}
	
//creating constructor without parameters

	public String getEmpid()
	{
		return empid;
	}
	
//writing getter and setter functions

	public void setEmpid(String id)
	{
		empid = id;
	}

	public String getEmpname() 
	{
		return empname;
	}

	public void setEmpname(String name) 
	{
		empname = name;
	}

	public int getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary(int salary) 
	{
		basicSalary = salary;
	}
	
//function for calculating salary with incentives
	
	public void calculateSalary()
	{
		finalSalary = basicSalary + 1000;
	}
	
//toString method for concatinating and returning string
	
	public String toString()
	{
		String str = "Employee Name : "+ empname +
					 "\nEmployee Id : "+ empid +
					 "\nBasic Salary : " + basicSalary +
					 "\nSalary with Insentives : "+ finalSalary +"\n\n";
		return str;
	}
	
	
	

}
