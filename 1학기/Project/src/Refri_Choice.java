import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Refri_Choice extends JPanel {
	Refri_Test test;
	ImageIcon image1;
	ImageIcon image2;
	ImageIcon image3;
	ImageIcon image4;
	JLabel labelImage1;
	JLabel labelImage2;
	JLabel labelImage3;
	JLabel labelImage4;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	Font f;
	
	public Refri_Choice(Refri_Test test) {
		this.test = test;
		setLayout(null);
		
		// 버튼
		button1 = new JButton("냉동실 보기");
		button2 = new JButton("냉장실 보기");
		button3 = new JButton("냉동실 추가");
		button4 = new JButton("냉장실 추가");
		// 버튼 테두리 유무
		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);
		button4.setBorderPainted(false);
		// 이미지 지정
		image1 = new ImageIcon("image/fre_show.png");
		image2 = new ImageIcon("image/refri_show.png");
		image3 = new ImageIcon("image/fre_add.png");
		image4 = new ImageIcon("image/refri_add.png");
		labelImage1 = new JLabel(image1);
		labelImage2 = new JLabel(image2);
		labelImage3 = new JLabel(image4);
		labelImage4 = new JLabel(image3);
		
		// 색 설정
		setBackground(Color.ORANGE);
		button1 = new JButton(image1);
		button2 = new JButton(image2);
		button3 = new JButton(image4);
		button4 = new JButton(image3);
		
		// 위치 설정
		button1.setBounds(370, 100, 300, 70);
		button2.setBounds(370, 200, 300, 70);
		button3.setBounds(370, 400, 300, 70);
		button4.setBounds(370, 500, 300, 70);
		
		//버튼 이미지 추가
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setContentAreaFilled(false);
		button4.setBorderPainted(false);
		button4.setFocusPainted(false);
		button4.setContentAreaFilled(false);
		
		// 출력
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		// button이 눌렸을 때 MyActionListener() 나옴
		button1.addActionListener(new MyActionListener1());
		button2.addActionListener(new MyActionListener2());
		button3.addActionListener(new MyActionListener3());
		button4.addActionListener(new MyActionListener4());
	}
	class MyActionListener1 implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			test.change("showRef");
		}
	}
	class MyActionListener2 implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			test.change("showFre");
		}
	}
	class MyActionListener3 implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			test.change("addFre");
		}
	}
	class MyActionListener4 implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			test.change("?");
		}
	}
}