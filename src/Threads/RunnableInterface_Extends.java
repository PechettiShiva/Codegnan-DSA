package Threads;

public class RunnableInterface_Extends
{

	public static void main(String[] args)
	{
		RunnableInterface ri=new RunnableInterface();
		Thread t=new Thread(ri);
        t.start();
        
        for(int i=1;i<=5;i++) {
        	System.out.println("Main Method implementation:"+i+"");
        }
      
	}

}
