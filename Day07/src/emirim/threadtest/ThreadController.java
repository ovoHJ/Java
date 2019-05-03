package emirim.threadtest;

public class ThreadController {

	public static void main(String[] args) {
//		1번 방법(extends Thread)
//		New Born 상태(새로 태어난상태)
		Thread1 t1 = new Thread1();
//		Runnable 상태(실행 가능한 상태)
		t1.start();
		
//		2번 방법(implements Runnable)
//		New Born 상태(새로 태어난 상태)
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
//		Runnable 상태(실행 가능한 상태)
		t.start();
	}

}
