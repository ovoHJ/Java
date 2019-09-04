
public class SynacTest {
	private int sum = 0;
	private int num = 0;
	public synchronized void IncreaseNumber() {
		num++;
		sum = sum + num;
	}
	public synchronized void IncreaseNumber2() {
		synchronized (this) {
			num++;
		}
	}
}
