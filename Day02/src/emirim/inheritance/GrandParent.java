package emirim.inheritance;

public class GrandParent {
	public String name;
	public int age;
	
	public GrandParent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void sleep(String name) {
		System.out.println(name + "�� ���� �ڴ�.");
	}
	public void eat(int time, String food) {
		System.out.println(time + "�ÿ� " + food + "�� �Դ�.");
	}
}
