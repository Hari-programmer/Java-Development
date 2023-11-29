package multiplethreds;
public class Task extends Thread{
//public class Applications extends Threads{
//public class Applications extends Ca implements Runnable {
	
	void app() {
		for(int doc=1; doc<10; doc++ ) {
			System.out.println("Printing the Application...."+doc);
		}
	}

}

class ca{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==Start application==");
		//applications a=new applications();
		//a.app();
		//Thread t=new Thread(a);
		//t.start();
		
	  Task r=new Task();
		//Thread t=new Thread(r);
		r.start();
		for(int doc=1; doc<10; doc++ ) {
			System.out.println("Printing the Application...."+doc);
		}
		System.out.println("==Finishimg Application==");
	}
	

}
