package NumberSystem;
import java.util.Scanner;
public class StrongNumber {
   public static int factorial(int n) {
	   int fact=1;
	   for(int i=1;i<=n;i++)
	   {
		   fact=fact*i;
	   }
	   return fact;
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+factorial(digit);
			n=n/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
		

	}

}
