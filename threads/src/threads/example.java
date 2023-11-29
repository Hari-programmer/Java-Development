package threads;

public class example {
	public static void main(String [] args) throws InterruptedException {
		
		
		 //Thread.currentThread().getPriority();
	//System.out.println( Thread.currentThread().getPriority());
	
	for (int i=0;i<10;i++) {
		for (int j=0;j<=i;j++) {
			
		System.out.println("LOVE YOU"+" "+i);
		Thread.sleep(1000);
	}
	System.out.println("LOVE YOU SO MUCH ::====");

	}	
	/*	public class example  extends Thread {
			 
			public void run() {
			for(int i=0;i<10;i++) {
			System.out.println("Music Playing ...... ");
			}
			}
			 
			public static void main(String Args[])
			{
			 
			example p=new example();
			p.start();
			 
			for(int i=0;i<10;i++) {
			System.out.println("coding");
			}
			
			*/
			
			}
			


}
