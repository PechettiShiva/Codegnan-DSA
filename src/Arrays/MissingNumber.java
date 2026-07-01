package Arrays;
import java.util.Scanner;
public class MissingNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		int expsum=(n+1)*(n+2)/2;
		int res=expsum-sum;
		System.out.println("The missing nunber is:"+res);
		

	}

}
