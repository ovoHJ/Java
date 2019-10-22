// 표준 입출력_한 글자

package 시험;

        import java.io.IOException;

public class Echo1Exam {

    public static void main(String[] args) {
        int bt;
        try {
            bt = System.in.read();
            System.out.println((char)bt);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
