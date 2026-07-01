//Developer,Tester display bonus for both
package This;
import java.util.Scanner;
public class Employee 
{
	private int empid;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private String empname;
	private int salary;
	
	Employee(int empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	
	void readValues()
	{
		Scanner sc=new Scanner(System.in);
		empid=sc.nextInt();
		empname=sc.next();
		salary=sc.nextInt();
	}
	
	void Bouns()
	{
		int incentive=10000;
		int res=salary+incentive;
		System.out.println("The Bonus is:"+salary);
	}
	
	void display()
	{
		System.out.println("Name of employee is:"+empid);
		System.out.println("Employee name is:"+empname);
		System.out.println("Employee is:"+salary);
	}

}
class Developer extends Employee
{
	
	
}


