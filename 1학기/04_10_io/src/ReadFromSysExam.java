import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
			System.out.write(b, 0, len);
		} catch(IOException e) {
			//e.printStackTrace();
			System.out.println("입력 실패");
		}
	}

}
