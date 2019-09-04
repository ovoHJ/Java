
public class DecimalToBin {

	public static void main(String[] args) {
		int num = 64;
		String result = "";
		
		for(int i = 0 ; i < 32 ; i++) {
			result = (num % 2) + result;
			num /= 2;
		}
		System.out.println(result);
	}

}
