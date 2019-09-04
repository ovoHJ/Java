import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineFileExam {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/dataw.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = " ";
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
