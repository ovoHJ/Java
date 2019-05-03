package emirim.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowView extends JFrame {
	private JLabel lblImg = new JLabel("", JLabel.CENTER);
	private JButton btnFast = new JButton("빠르게");
	private JButton btnMiddle = new JButton("중간빠르기");
	private JButton btnSlow = new JButton("느리게");
	
	public SlideShowView() {
		JPanel panBtn = new JPanel();
		panBtn.setBackground(Color.WHITE);
		panBtn.add(btnFast);
		panBtn.add(btnMiddle);
		panBtn.add(btnSlow);
		add(lblImg, "Center");
		add(panBtn, "South");
		add(lblImg, "Center");
		setTitle("Image Slide Show");
		getContentPane().setBackground(new Color(255, 217, 236));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(280, 50, 900, 700);
		setVisible(true);
	}

	public JLabel getLblImg() {
		return lblImg;
	}

	public JButton getBtnFast() {
		return btnFast;
	}

	public JButton getBtnMiddle() {
		return btnMiddle;
	}

	public JButton getBtnSlow() {
		return btnSlow;
	}
	
	
}
