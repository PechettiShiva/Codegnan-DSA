package SearchingAlgorithms;

public class FirstOccurence {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,2,2,2,2,2,3,4};
		int target=2;
		
		int low=0;
		int high=arr.length-1;
		//int first=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==target)
			{
				//first=mid;
				high=mid-1;
			}
			else if(arr[mid]>target)
			{
				high=mid-1;
			}else 
			{
				low=mid+1;
				
			}
		}
		System.out.println("First Occurence of target is:"+target);

	}

}
