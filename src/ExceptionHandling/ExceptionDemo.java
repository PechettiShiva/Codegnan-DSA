package ExceptionHandling;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int res=a/b;
			System.out.println("The Result is:"+res);
		}catch(ArithmeticException e) {
			System.out.println("The exception is:"+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Always Executes");
		}

	}

}
