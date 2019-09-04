/*
 * 2302 강혜정
 * 이 프로젝트는 우리 집 냉장고에 어떤 재료와 음식이 있는지 확인하고, 장 볼 때 이미 사놓은 재료를 사는 것을 방지해주는 프로그램을 구현하는 것입니다.
 * 또한 구매한 재료들을 추가할 수 있습니다.
 * 실행 방법은 어느 파일에서든 실행시키면 됩니다.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

// 이 class는 냉장실에 음식을 넣는 class입니다
public class addFre extends JPanel {
	Refri_Test test;
	ImageIcon image1;
	ImageIcon image2;
	JLabel labelImage1;
	JLabel labelImage2;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JButton button1;
	JButton button2;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel title;
	Font f;
	Font f2;
	
	Food food;
	
	// 생성자
	public addFre(Refri_Test test) {
		this.test = test;
		setLayout(null);
		
		// 버튼
		button1 = new JButton("추가하기");
		button2 = new JButton("뒤로가기");
		// 입력받는 칸
		text1 = new JTextField("ex) 암기빵");
		text2 = new JTextField("양식) YYYYMMDD");
		text3 = new JTextField("양식) YYYYMMDD");
		text4 = new JTextField("ex) 암기빵 하나면 시험은 끝...");
		// 입력에 대한 설명
		label1 = new JLabel("이름");
		label2 = new JLabel("제조일자");
		label3 = new JLabel("유통기한");
		label4 = new JLabel("메모");
		title = new JLabel("¿ 냉장실 안에 넣을 음식은 ?");
		
		// 버튼 테두리 유무
		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		// 폰트 설정
		f = new Font("BM DoHyeon", Font.PLAIN, 30);
		f2 = new Font("BM DoHyeon", Font.PLAIN, 40);
		text1.setFont(f);
		text2.setFont(f);
		text3.setFont(f);
		text4.setFont(f);
		label1.setFont(f);
		label2.setFont(f);
		label3.setFont(f);
		label4.setFont(f);
		title.setFont(f2);
		
		// 이미지 지정
		image1 = new ImageIcon("image/add.png");
		image2 = new ImageIcon("image/back.png");
		
		// 색 설정
		setBackground(Color.ORANGE);
		button1 = new JButton(image1);
		button2 = new JButton(image2);
		label1.setForeground(Color.WHITE);
		label2.setForeground(Color.WHITE);
		label3.setForeground(Color.WHITE);
		label4.setForeground(Color.WHITE);
		title.setForeground(Color.WHITE);
		
		// 위치 설정
		button1.setBounds(170, 530, 300, 70);
		button2.setBounds(570, 530, 300, 70);
		text1.setBounds(370, 130, 500, 50);
		text2.setBounds(370, 230, 500, 50);
		text3.setBounds(370, 330, 500, 50);
		text4.setBounds(370, 430, 500, 50);
		label1.setBounds(220, 130, 200, 50);
		label2.setBounds(190, 230, 200, 50);
		label3.setBounds(190, 330, 200, 50);
		label4.setBounds(220, 430, 200, 50);
		title.setBounds(20, 30, 500, 50);
		
		//버튼 이미지 추가
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);
		
		// 출력
		add(button1);
		add(button2);
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(title);
		
		// button이 눌렸을 때 MyActionListener() 나옴
		button1.addActionListener(new MyActionListener1());
		button2.addActionListener(new MyActionListener2());
	}
	class MyActionListener1 implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			food = new Food();
			food.setName(text1.getText());
			food.setMake_date(text2.getText());
			food.setEnd_date(text3.getText());
			food.setMemo(text4.getText());
			
			// 두 날짜 사이 구하기
			String strStartDate = food.getMake_date();
			String strEndDate = food.getEnd_date();
			String strFormat = "yyyyMMdd";
			
			SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
			try {
				// Date로 저장
				Date startDate = sdf.parse(strStartDate);
				Date endDate = sdf.parse(strEndDate);
				
				// 계산
				long diffDay = (endDate.getTime() - startDate.getTime()) / (24*60*60*1000);
				food.setLeft_date(Long.toString(diffDay));
			} catch(ParseException ee) {
				ee.printStackTrace();
			}
			
				try {
					// 저장하기
					BufferedWriter bw = new BufferedWriter(new FileWriter("txt/Ref.txt", true));
					bw.write(food.getName() + "\t" + food.getLeft_date() + "\t" + food.getMake_date() + "\t");
					bw.write(food.getEnd_date()+ "\t" + food.getMemo());
					bw.newLine();
					bw.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			// Refri_Test에 panel02 넘김
			test.change("panel02");
		}
	}
	class MyActionListener2 implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			test.change("panel02");
		}
	}
}