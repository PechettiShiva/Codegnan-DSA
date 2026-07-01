package NumberSystem;
import java.util.Scanner;
public class SpyNumber { //a number where the sum of its individual digits is exactly equal to the product of its digits.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		int res1=sum;
		
		int prod=1;
		while(temp>0)//can't n in this loop because after running sum loop the n becomes "0".
		{
			int digit1=temp%10;
			prod=prod*digit1;
			temp=temp/10;
		}
		int res2=prod;
		
		if(res1==res2)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}

	}

}
