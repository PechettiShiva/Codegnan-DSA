package Polymorphism;

public class overloading {
	public void add(int a)
	{
		System.out.println("Value is:"+a);
	}
	public void add(int a,int b) {
		int res=a+b;
		System.out.println("The result is:"+res);
	}
	public void add(int a,int b,int c) {
		int res=a+b+c;
		System.out.println("The result is:"+res);
	}

	

}
