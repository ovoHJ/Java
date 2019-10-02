import javax.swing.*;
import java.awt.*;

public class GUI7_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(null);
        JButton bt0 = new JButton("Button" + 0);
        JButton bt1 = new JButton("Button" + 1);

        bt0.setBounds(10, 20, 100, 50);
        bt1.setBounds(120, 20, 100, 100);

        panel.add(bt0);
        panel.add(bt1);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
