package Threads;

public class ExtendsThread_Main {

	public static void main(String args[]) {
		
			ExtendsThread et=new ExtendsThread();
			et.run();
			
			
			for(int i=1;i<=5;i++) {
					System.out.println("Main Method:"+i+" ");
			}
			
		}
	   

}
