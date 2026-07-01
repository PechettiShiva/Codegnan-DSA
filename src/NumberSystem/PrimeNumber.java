package NumberSystem;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				count++;
			}
			
		}
		System.out.println("Count of numbers is:"+count);
		if(count==2)//Prime number should exactly divide with one and itself.
		{
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}

	}

}
