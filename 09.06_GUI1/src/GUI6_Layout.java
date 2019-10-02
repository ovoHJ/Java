import javax.swing.*;
import java.awt.*;

public class GUI6_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);

        JLabel lbTitle = new JLabel("아 마 스 빈");
        JTextArea taList = new JTextArea( 1, 30);
        JPanel eastPanel = new JPanel();
        int sum = 10000;
        JLabel lbSum = new JLabel("총금액 : " + sum);
        JButton btPayment = new JButton("결제하기");

        eastPanel.add(lbSum);
        eastPanel.add(btPayment);
        panel.add(lbTitle, BorderLayout.NORTH);
        panel.add(taList, BorderLayout.CENTER);
        panel.add(eastPanel, BorderLayout.EAST);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
