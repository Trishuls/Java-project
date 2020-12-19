package learn;

public class Multithread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

//	private void sleep() {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

	public static void main(String[] args) {

		Multithread t1 = new Multithread();
		
		Multithread t2 = new Multithread();
		
		Multithread t3 = new Multithread();
		
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
