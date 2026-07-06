package Arrays;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[]= {2,2,1,1,2,2,2};
		int n=(arr.length)/2;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr)
		{
			map.put(num,map.getOrDefault(num,0)+1);
		}
		for(int num:arr)
		{
			if(map.get(num)>(n)){
				System.out.println("Element Found: "+num);
				return;
				
			}
		}
		System.out.println("Element not found");
		
		
		
		

	}

	

}
