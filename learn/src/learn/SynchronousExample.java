package learn;

public class SynchronousExample {

	public static void main(String[] args) {
		
		Show s = new Show();
		
		ThreadDemo d1 = new ThreadDemo("hi", s);
		ThreadDemo d2 = new ThreadDemo("bye", s);
		
		d1.start();
		
		
		try {
			d1.join();
//			d2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d2.start();
	}

}
class ThreadDemo extends Thread
{
	String message;
	Show show;
	
	public ThreadDemo(String message, Show show) {
		super();
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

class Show{
	public void show(String msg)
	{
		System.out.println("sending "+msg);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(msg+" sent");
	}
}