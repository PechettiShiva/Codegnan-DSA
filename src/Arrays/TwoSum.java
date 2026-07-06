package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum { //using complementary pattern

	public static void main(String[] args) {
		int arr[]= {2,7,11,15,12};
		int target=9;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int Complement=target-arr[i];
			
			if(map.containsKey(Complement))
			{
				System.out.println("index :"+map.get(Complement)+" "+i);
				return;
			}
			map.put(arr[i],i);
		}

	}

}
