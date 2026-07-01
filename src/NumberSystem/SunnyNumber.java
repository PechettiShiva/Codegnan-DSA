package NumberSystem;
import java.util.Scanner;
public class SunnyNumber {//n=3,sqrt=4,root=2,(root*root)=4,n+1=4,(root*root==n+1).

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int root=(int) Math.sqrt(n+1);
		
		if((root*root)==n+1)
		{
			System.out.println("Sunny Number");
		}
		else
		{
			System.out.println("Not a Sunny Number");
		}

	}

}
