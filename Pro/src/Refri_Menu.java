/*
 * 2302 강혜정
 * 이 프로젝트는 우리 집 냉장고에 어떤 재료와 음식이 있는지 확인하고, 장 볼 때 이미 사놓은 재료를 사는 것을 방지해주는 프로그램을 구현하는 것입니다.
 * 또한 구매한 재료들을 추가할 수 있습니다.
 * 실행 방법은 어느 파일에서든 실행시키면 됩니다.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//이 class는 맨 처음 화면이 나오는 class입니다
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