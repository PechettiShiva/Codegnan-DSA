package Arrays;
import java.util.Arrays;
public class DeleteElement 
{
	

	public static void main(String[] args) 
	{
		int arr[]= {2,5,6,8,3,9};
		int position=3;
		int newArray[]=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(i==position)  //if 3==3 then the loop will skip 3rd index
			{
				continue;
			}
			newArray[j]=arr[i]; //here the arr[i] values will be stored in newArray[j]
			j++; //j value is incremented in each case.
		}
		System.out.println("New Array is:" +Arrays.toString(newArray));
		System.out.println("Old array is:"+Arrays.toString(arr));
		

	}

}
