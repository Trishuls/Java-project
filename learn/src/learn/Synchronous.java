package learn;

public class Synchronous extends Thread{
	private String message;
	private Showing show;
	
	public Synchronous(String message, Showing show) {
		this.message = message;
		this.show = show;
	}
	
	public void run()
	{
		synchronized (message) {
			show.show(message);
		}
	}
	
}
class Showing{
	
	public void show(String message)
	{
		 System.out.println("Sending\t"+message);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("\n"+message+"sent");
	}
	
}
class demo
{
	public static void main(String args[])
	{
		Showing show = new Showing();
		
		Synchronous s1 = new Synchronous("hi", show);
		Synchronous s2 = new Synchronous("bye", show);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}