package Arrays;

public class FindNumber {

	public static void main(String[] args) {
		int arr[]= {18,39,36,93,72};
		int target=72;
		int index=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				index=i;
				break;
			}
		}
		System.out.println(index!=-1?"found at :"+index:"not found");

	}

}
