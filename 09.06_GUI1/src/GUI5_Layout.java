import javax.swing.*;
import java.awt.*;

public class GUI5_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);

        JButton bt0 = new JButton("Btton" + 0);
        JButton bt1 = new JButton("Btton" + 1);
        JButton bt2 = new JButton("Btton" + 2);
        JButton bt3 = new JButton("Btton" + 3);
        JButton bt4 = new JButton("Btton" + 4);
        JButton bt5 = new JButton("Btton" + 5);

        panel.add(bt0, BorderLayout.NORTH);
        panel.add(bt1, BorderLayout.WEST);
        panel.add(bt2, BorderLayout.CENTER);
        panel.add(bt3, BorderLayout.EAST);
        panel.add(bt4, BorderLayout.SOUTH);
        panel.add(bt5, BorderLayout.NORTH);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
