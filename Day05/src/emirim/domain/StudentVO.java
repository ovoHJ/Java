package emirim.domain;

public class StudentVO {
	
	private int classNumber;
	private String name;
	private int kor, eng, math, home, hitory;
	private int sum;
	private double average;
	
	public StudentVO () {
		
	}
	public StudentVO(int classNumber, String name, int kor, int eng, int math, int home, int hitory) {
		super();
		this.classNumber = classNumber;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.home = home;
		this.hitory = hitory;
	}
	
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getHome() {
		return home;
	}
	public void setHome(int home) {
		this.home = home;
	}
	public int getHitory() {
		return hitory;
	}
	public void setHitory(int hitory) {
		this.hitory = hitory;
	}
	public int getSum() {
		sum = kor + eng + math + home + hitory;
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAverage() {
		average = sum/5;
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
}
