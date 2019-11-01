import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm {
    private JTextField tfName;
    private JButton btHello;
    private JLabel lbTitle;
    private JLabel lbResult;
    private JPanel panel;

    public HelloForm() {
        btHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbResult.setText("Hello, " + tfName.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("인사하기");
        frame.add(new HelloForm().panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
