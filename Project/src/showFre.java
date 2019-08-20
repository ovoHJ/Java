import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class showFre extends JPanel {
	static ArrayList<Food> foods = new ArrayList<>();
	
	Refri_Test test;
	ImageIcon img;
	JTextArea area;
	JScrollPane scroll;
	JButton button;
	JLabel title;
	Font f;
	Font f2;
	
	
	public showFre(Refri_Test test) {
		this.test = test;
		setLayout(null);
		area = new JTextArea();
		scroll = new JScrollPane();
		button = new JButton("뒤로가기");
		title = new JLabel("¿ 냉장실 안에 있는 음식은 ?");
		title.setFont(f2);
		
		button.setBorderPainted(false);
		
		f = new Font("BM DoHyeon", Font.PLAIN, 30);
		f2 = new Font("BM DoHyeon", Font.PLAIN, 20);
		area.setFont(f2);
		title.setFont(f);
		
		img = new ImageIcon("image/back.png");
		
		setBackground(Color.ORANGE);
		button = new JButton(img);
		area.setForeground(Color.BLACK);
		title.setForeground(Color.WHITE);
		
		button.setBounds(370, 530, 300, 70);
		title.setBounds(20, 30, 500, 50);
		area.setBounds(130, 120, 800, 380);
		
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		
		add(area);
		add(button);
		add(title);
		
		
		// 파일 연결
		FileReader fr;
		try {
			fr = new FileReader("txt/Fre.txt");
			// 버터 연결
			BufferedReader br = new BufferedReader(fr);
			// 반복, 한줄 읽기
			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				// 새 객체 만들어서 넣기
				Food food = new Food();
				food.setName(st.nextToken());
				food.setLeft_date(st.nextToken());
				food.setMake_date(st.nextToken());
				food.setEnd_date(st.nextToken());
				food.setMemo(st.nextToken());
				foods.add(food);
				
				area.append("\n");
				area.append("   " +food.getName() + "\n");
				area.append("   남은날짜  :  " + food.getLeft_date() + "\n");
			}			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		button.addActionListener(new MyActionListener());
	}
	class MyActionListener implements ActionListener {
		@Override
		// 일종의 화면 태그. 여기서 지정하고 Refri_Test의 change에서 비교 후 화면 전환
		public void actionPerformed(ActionEvent e) {
			test.change("panel02");
		}
	}
}