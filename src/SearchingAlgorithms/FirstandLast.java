package SearchingAlgorithms;

public class FirstandLast 
{
	public static int[] searchRange(int nums[],int target)
	{
		int first=findBound(nums,target,true);
		int last=findBound(nums,target,false);
		return nums;
	}
	public static int findBound(int nums[],int target,boolean isFirst)
	{
		int low=0;
		int high=nums.length-1;
		int index=-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(nums[mid]==target)
			{
				index=mid;
				if(isFirst)
				{
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}else if(target>nums[mid])
			{
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int nums[]= {1,1,2,2,2,2,2,2,2,2,3,4,5};
		int target=12;
		int result[]=FirstandLast.searchRange(nums, target);
		System.out.println("First Occurence:"+result[0]);
		System.out.println("Last Occurence:"+result[1]);
	}

}
