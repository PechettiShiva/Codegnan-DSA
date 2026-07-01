package ExceptionHandling;
import java.util.Scanner;
public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try 
		{
			int arr[]= {1,2,3,4,5,6};
			int access=arr[4];
			System.out.println("The index number is:"+access);
			
		
		       try 
		       {
			     int a=sc.nextInt();
			     int b=sc.nextInt();
			     int res=a/b;
			      System.out.println("The result is:"+res);
		      } catch(ArithmeticException e) 
		       {
			           e.printStackTrace();
		       }
		  
	     }catch(ArrayIndexOutOfBoundsException e) 
		{
	    	 e.printStackTrace();
	    	 
	     }
		finally {
			System.out.println("This block always executes");
		}
	}

}
