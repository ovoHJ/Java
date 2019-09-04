import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Refri_Menu extends JPanel {
	Refri_Test test;
	ImageIcon image1;
	ImageIcon image2;
	Color color1;
	JLabel labelImage;
	JButton button;
	Font f;
	
	public Refri_Menu(Refri_Test test) {
		this.test = test;
		setLayout(null);
		
		// 버튼
		button = new JButton("냉장고 열기");
		// 버튼 테두리 유무
		button.setBorderPainted(false);
		// 폰트
		f = new Font("BM DoHyeon", Font.PLAIN, 30);
		// 폰트 설정
		button.setFont(f);
		// 색깔
		color1 = new Color(0xf07a56);
		// 이미지 지정
		image1 = new ImageIcon("image/title.png");
		image2 = new ImageIcon("image/openRefri.png");
		labelImage = new JLabel(image1);
		
		// 색 설정
		setBackground(Color.ORANGE);
		button = new JButton(image2);
		
		// 위치 설정
		labelImage.setBounds(170, 10, 700, 500);
		button.setBounds(370, 500, 300, 70);
		
		//버튼 이미지 추가
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		
		// 출력
		add(labelImage);
		add(button);
		
		// button이 눌렸을 때 MyActionListener() 나옴
		button.addActionListener(new MyActionListener());
	}
	class MyActionListener implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			//System.exit(0);
			test.change("panel02");
		}
	}
}