package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays 
{
	public static int[] intersection(int[] arr1,int[] arr2)
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		List<Integer> list=new ArrayList<Integer>();
		for(int num:arr1) //add arr1 elements in map using for each loop.
		{
			map.put(num,map.getOrDefault(num, 0)+1);//if it is there it add in the map , if it's already there it increases count.
		}
		
		for(int num:arr2)
		{
			if(map.containsKey(num) && map.get(num)>0)//map should contain that number and should be greater than zero.
			{
				list.add(num); //if map contains number and if it's greater than zero add it to the list.
				map.put(num,map.get(num)-1);//after adding it to list decrese the count in map.
			}
		}
		
		int[] result=new int[list.size()]; //the result is stored in list and now it is stored in array.
		for(int i=0;i<list.size();i++)
		{
			result[i]=list.get(i);//adding result in array.
		}
		return result;
		
	}

	public static void main(String[] args) 
	{
		int arr1[]= {1,2,1,2};
		int arr2[]= {2,2};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
	}

}
