package This;
class SuperDemo{
	int salary=60000;
	public void getSalary(int salary)
	{
		salary=50000;
		System.out.println("My parent Salary:"+salary);
	}
}
public class ThisDemo extends SuperDemo{
	int salary=30000;
	public void getSalary(int salary) {
		salary=20000;
		System.out.println("My salary is:"+salary);
		System.out.println("My global salary:"+this.salary);
		
		super.getSalary(40000);
		System.out.println("My parent salary :"+super.salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo();
		td.getSalary(10000);
		

	}

}
