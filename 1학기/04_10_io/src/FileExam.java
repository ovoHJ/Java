import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExam {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("test.java");
		} catch (FileNotFoundException fe) {
			System.out.println("fe.toString() : " + fe.toString());
		}
	}

}
