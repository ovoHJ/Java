// 표준 입출력_여러 문자

package 시험;

import java.io.IOException;

public class Echo2Exam {

    public static void main(String[] args) {
        int bt;
        try {
            while((bt = System.in.read()) != -1) {
                System.out.print((char)bt);
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }

}
