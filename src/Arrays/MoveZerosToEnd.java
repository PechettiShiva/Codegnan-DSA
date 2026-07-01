package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,0,3,0,2};
		int newArray[]= new int[arr.length+1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
			{
				newArray[j]=arr[i];
				j++;
			}
		}
		System.out.println("After moving zero's to End:" +Arrays.toString(newArray));

	}

}
