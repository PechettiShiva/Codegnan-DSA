package Arrays;

import java.util.HashMap;
import java.util.Map;

public class PairDifferenceInArray {

	public static void main(String[] args) {
		int arr[]= {1,5,3,4,2};
		int k=2;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			
			if(map.containsKey(num-k))
			{
				System.out.println("Pair Found");
				System.out.println("Index :"+map.get(num-k)+" "+i);
				System.out.println("values :"+(num+k)+" "+num);
				return;
			}
			if(map.containsKey(num+k))
			{
				System.out.println("Pair Found");
				System.out.println("Index :"+map.get(num+k)+" "+i);
				System.out.println("values :"+(num+k)+" "+num);
				return;
			}
			map.put(arr[i],num);
		}
		System.out.println("No pair found");

	}

}
