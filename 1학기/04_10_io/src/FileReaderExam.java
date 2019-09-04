import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char buffer[] = new char[100];
		FileReader fr;
		try {
			fr = new FileReader("src/datar.txt");
			FileWriter fw = new FileWriter("src/dataw.txt");
			fr.read(buffer, 0, buffer.length);
			String str = new String(buffer);
			System.out.println(str);
			fw.write(buffer);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
