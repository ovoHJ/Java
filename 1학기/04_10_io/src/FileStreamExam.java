import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] b = new byte[1024];
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("src/tin.txt");	//FileNotFoundException
			fos = new FileOutputStream("src/tout.txt");	
			fis.read(b);
			fos.write(b);
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
