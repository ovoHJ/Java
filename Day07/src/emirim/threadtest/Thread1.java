package emirim.threadtest;

public class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			try {
				sleep(500);
				System.out.println("Thread1 : " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
