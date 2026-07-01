package Threads;

public class RunnableInterface implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println("Run Method Implementation:"+i+" ");
			
		}
	}

}
