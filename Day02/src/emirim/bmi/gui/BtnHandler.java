package emirim.bmi.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BtnHandler implements ActionListener {
	
	private JTextField textName, textWeight, textHeight;
	private JLabel lblResult;
	

	public BtnHandler(JTextField textName, JTextField textWeight, JTextField textHeight, JLabel lblResult) {
		super();
		this.textName = textName;
		this.textWeight = textWeight;
		this.textHeight = textHeight;
		this.lblResult = lblResult;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = textName.getText();
		double weight = Double.parseDouble(textWeight.getText());
		double height = Double.parseDouble(textHeight.getText());
		Men men = new Men(name, weight, height);
		BMICalc c = new BMICalc();
		double bmi = c.calc(men);
		String imgPath = "imgs/" + c.resultPath(bmi) + ".png";
		ImageIcon icon = new ImageIcon(imgPath);
		lblResult.setIcon(icon);
	}

}
