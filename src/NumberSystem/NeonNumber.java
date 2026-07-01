package NumberSystem;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sqr=n*n;
		System.out.println(sqr);
		int sum=0;
		int temp=n;
		while(sqr>0)
		{
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
			
		}
		System.out.println("The sum is:"+sum);
		if(sum==temp)
		{
			System.out.println("Neon Number");
		}else {
			System.out.println("Not a Neon Number");
		}

	}

}
