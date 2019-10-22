public class Echo1Exam {

    public static void main(String[] args) {
        int bt;
        try {
            bt = System.in.read();
            System.out.print((char)bt);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
