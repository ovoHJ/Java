package emirim.bmi.console;

public class Men {
	private String name;
	private double weight;
	private double height;
	
	public Men() {
		
	}
	public Men(String name, double weight, double height) {
		super(); //생략 가능
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		System.out.println("┌────────────────────");
	}
	
	
}
