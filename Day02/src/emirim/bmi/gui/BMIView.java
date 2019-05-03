package emirim.bmi.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMIView extends JFrame {
	
	public BMIView() {
		
		getContentPane().setBackground(Color.orange); //프레임의 배경색 
		JPanel panNorth = new JPanel();
		panNorth.setBackground(Color.gray);
		
		JLabel lblName = new JLabel("⇒  성명 : ");
		JLabel lblWeight = new JLabel("⇒  체중 : ");
		JLabel lblHeight = new JLabel("⇒  신장 : ");
		ImageIcon icon = new ImageIcon("imgs/bmi_logo.gif");
		JLabel lblResult = new JLabel(icon);
		
		JTextField textName = new JTextField(10);
		JTextField textWeight = new JTextField(10);
		JTextField textHeight = new JTextField(10);
		
		JButton btnResult = new JButton("결과");
		btnResult.addActionListener(new BtnHandler(textName, textWeight, textHeight, lblResult));
		panNorth.add(lblName);
		panNorth.add(textName);
		panNorth.add(lblWeight);
		panNorth.add(textWeight);
		panNorth.add(lblHeight);
		panNorth.add(textHeight);
		panNorth.add(btnResult);
		
		add(panNorth, "North");
		add(lblResult, "Center");
		
		setTitle("체질량지수");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BMIView();
	}
	
}