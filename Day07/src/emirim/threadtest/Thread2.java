package emirim.threadtest;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("Thread2 : " + i);
		}

	}

}
