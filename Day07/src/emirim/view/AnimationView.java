package emirim.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimationView extends JFrame {
	
	private JButton btnFast = new JButton("Faster");
	private JButton btnSlow = new JButton("Slower");
	private JButton btnStop = new JButton("Stop");
	private JButton btnStart = new JButton("Start");
	private JLabel lblNeo = new JLabel();

	public AnimationView() {
		JPanel pan = new JPanel();
		JPanel panAni = new JPanel(null); //레이아웃 제거
		add(pan, "North");
		add(panAni, "Center");
		panAni.setBackground(Color.WHITE);
		pan.setBackground(Color.white);
		pan.add(btnFast);
		pan.add(btnSlow);
		pan.add(btnStop);
		pan.add(btnStart);
		
		String filename = "imgs/neo1.gif";
		ImageIcon icon = new ImageIcon(filename);
		lblNeo.setIcon(icon);
		lblNeo.setBounds(0, 150, 400, 310);
		panAni.add(lblNeo);
		setTitle("AnimationView");
		getContentPane().setBackground(new Color(255, 217, 236));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50, 50, 900, 700);
		setVisible(true);
	}

	public JButton getBtnFast() {
		return btnFast;
	}

	public JButton getBtnSlow() {
		return btnSlow;
	}

	public JButton getBtnStop() {
		return btnStop;
	}

	public JButton getBtnStart() {
		return btnStart;
	}

	public JLabel getLblNeo() {
		return lblNeo;
	}
	
}
