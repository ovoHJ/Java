import java.util.Scanner;

public class Sum_Odd_Even {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		num = scan.nextInt();
		
		int odd_sum = 0, even_sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				even_sum += i;
			}
			else {
				odd_sum += i;
			}
		}
		
		System.out.println("홀수의 합 : " + odd_sum);
		System.out.println("짝수의 합 : " + even_sum);
	}

}
