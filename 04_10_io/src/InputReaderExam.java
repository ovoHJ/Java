import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
		while(true) {
			int i;
			try {
				i = reader.read();
				if(i == -1) break;		//Ctrl+z 누르면 뷀=브레이크
				char c = (char)i;
				System.out.print(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
