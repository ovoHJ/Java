import javax.swing.*;
import java.awt.*;

public class GUI4_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        GridLayout gl = new GridLayout(3, 2);
        panel.setLayout(gl);

        for(int i = 0 ; i < 6 ; i++) {
            JButton bt = new JButton("Button" + i);
            panel.add(bt);
        }

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
