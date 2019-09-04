import java.io.IOException;
import java.util.Scanner;

public class IOProgram {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String inputString = scanner.nextLine();
//		System.out.println(inputString);
//		System.err.println(inputString);

		int bt;
		try {
			while((bt = System.in.read()) != 'x') { //한 글자를 읽는 것(사실은 한 int를 읽는것)
			System.out.print((char)bt);		
			}
		} catch(IOException e) {
			e.printStackTrace();
		} //Ctrl + z하면 멈춤
	}

}
