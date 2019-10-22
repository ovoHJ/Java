import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        ImageIcon iijpg = new ImageIcon(GUI8_ImageIcon.class.getResource("img/bts.png"));
        ImageIcon iiJpg_edit = new ImageIcon(iijpg.getImage().getScaledInstance(iijpg.getIconWidth()/10, iijpg.getIconHeight()/10, Image.SCALE_DEFAULT));
        JLabel lbii = new JLabel(iiJpg_edit);

        ImageIcon ii_edit = new ImageIcon(iijpg.getImage().getScaledInstance(iijpg.getIconWidth()/4, iijpg.getIconHeight()/4, Image.SCALE_DEFAULT));
        JButton btll = new JButton(ii_edit);

        panel.add(btll);
        panel.add(lbii);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(1000, 700));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
