package NumberSystem;
import java.util.Scanner;
public class ArmStrongNumber {  //153=1^3+5^3+3^3=1+125+27=153

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(sum==temp)
		{
		  System.out.println("ArmstrongNumber");
		}else {
			System.out.println("Not an ArmstrongNumber");
		}
		
		

	}

}
