package classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		
		int sum1 = add(num1, num2);
		int sum2 = minus(num1, num2);
		int sum3 = rhq(num1, num2);
		float sum4 = sk(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum1);
		System.out.println(num1 + " - " + num2 + " = " + sum2);
		System.out.println(num1 + " ¡¿ " + num2 + " = " + sum3);
		System.out.println(num1 + " ¡À " + num2 + " = " + sum4);
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int rhq(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static float sk(int n1, int n2) {
		float result = (float)n1 / (float)n2;
		return result;
	}
}
