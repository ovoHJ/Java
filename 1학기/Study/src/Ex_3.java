import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100 + 1);
		int answer = 0;
		int i = 0;
		while(i < 5) {
			System.out.print("숫자 입력(0~100)? ");
			answer = sc.nextInt();
			i++;
			if(random > answer)
				System.out.println("너무 작습니다.("+i+"회)");
			else if(random == answer) {
				System.out.println("***** 축하합니다. *****");
				break;
			}
			else if(random < answer)
				System.out.println("너무 큽니다.("+i+"회)");
		}
	}
}
