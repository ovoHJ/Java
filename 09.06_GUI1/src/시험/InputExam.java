// 1바이트 문자 입출력

package 시험;

import java.io.*;

public class InputExam {
    public static void streamTest(InputStream is) {
        try {
            while(true) {
                int i = is.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.println(c);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        streamTest(System.in);
    }
}
