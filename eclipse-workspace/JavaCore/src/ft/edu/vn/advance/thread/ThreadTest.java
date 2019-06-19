package ft.edu.vn.advance.thread;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {			
			System.out.println(Thread.currentThread().getName() + "  thread is running..." + i);
			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}

//	public void run() {
//		System.out.println("thread is running...");
//	}
	
	

}
