import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Refri_Menu {
	// Window창 생성 [메인 프레임]
	JFrame frame = new JFrame("우리집 냉장고에는?");
	Font f = new Font("BM DoHyeon", Font.PLAIN, 30);
	// 색깔 만들기
	Color color1 = new Color(0xf07a56);
	
	public void JFrame1( ) {
		// Window창 크기 저장
				Dimension dim = new Dimension(1080, 720);
				
				// Window창 크기 맞춤
				frame.setPreferredSize(dim);
				
				// 레이아웃 적용과 각종 UI 배치 가능한 프레임 [보조 프레임]
				JPanel panel = new JPanel();

				// 이미지 저장
				ImageIcon image = new ImageIcon("image/title.png");
				JLabel labelImage = new JLabel(image);
				// 버튼
				JButton button = new JButton("냉장고 열기");
				// 판넬 위치 자유자재
				panel.setLayout(null);
				
				// 폰트 설정
				button.setFont(f);
				
				// 위치 지정
				labelImage.setBounds(170, 10, 700, 500);
				button.setBounds(370, 500, 300, 70);
				
				// 색 설정
				panel.setBackground(Color.ORANGE);
				button.setBackground(Color.WHITE);
				button.setForeground(color1);
				
				// 버튼 테두리 
				button.setBorderPainted(false);
				
				// 프레임에 출력
				panel.add(labelImage);
				frame.add(panel);
				panel.add(button);
				
				// 화면 크기에 맞춰
				frame.pack();
				// frame 보이게
				frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		Refri_Menu refri = new Refri_Menu();
		
		ActionListener listener1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
	}
}
