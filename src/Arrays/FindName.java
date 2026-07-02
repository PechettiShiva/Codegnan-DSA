package Arrays;

public class FindName {

	public static void main(String[] args) {
		String names[]= {"bahu","bali","deva","sena"};
		String target="kalakeya";
		
		boolean found=false;
		for(String name:names)
		{
			if(name.contains(target))
			{
				found=true;
				break;
			}
		}
		System.out.println(found ?" present":"Absent");

	}

}
