package Strings;
import java.util.HashMap;
public class FirstNonRepeatingChr {

	public static void main(String[] args) {
		String s="jjava";
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		
		for(char ch:s.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		for(char ch:s.toCharArray())
		{
			if(map.get(ch)==1)
			{
				System.out.println("First Non repeating character in String:"+ch);
				return;
			}
		}
		System.out.println("First repeating element not found");

	}

}
