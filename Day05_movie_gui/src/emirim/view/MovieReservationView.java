package emirim.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnPayHandller;
import emirim.handler.LblHandler;
import emirim.persistence.MovieDAO;

public class MovieReservationView extends JFrame {
	public JLabel lblInfo = new JLabel(" ");
	public JLabel lblTicket = new JLabel("", JLabel.CENTER);
	
	public MovieReservationView(MovieDAO dao) {
		displayMovies(dao);
		displayInfo();
		displayTicket();
		getContentPane().setBackground(Color.WHITE);
		setTitle("��ȭ ���� ���� �ý���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(30, 15, 800, 500);
		setVisible(true);
	}
	
	public void displayMovies (MovieDAO dao) {
		int[] movieIds = {1206, 2683, 3692, 4960, 5184};
		String[] movieTitles = {"Ʈ���϶���", "����", "��Ŭ����", "�극��ŷ��pt1", "�극��ŷ��pt2"};
		int[] overAges = {12, 12, 12, 15, 15};
		String[] genres = {"�θǽ�", "�θǽ�", "�θǽ�", "�θǽ�", "�θǽ�"};
		int[] prices = {9000, 9000, 9000, 9000, 9000};
		String[] posterNames = {"movie0", "movie1", "movie2", "movie3", "movie4"};
		
		ArrayList<MovieVO> mList = dao.getMovieList();
		for (int i = 0; i < posterNames.length; i++) {
			mList.add(new MovieVO(movieIds[i], movieTitles[i], overAges[i], genres[i], prices[i], posterNames[i]));
		}
		
		JPanel panN = new JPanel(new GridLayout(1, 5));
		panN.setBackground(Color.orange);
		
//		������ ��ġ�ϳ�  ���� ���� ���� �� ����ϴ� �ݺ��� (��ȭ ������ŭ ���� ����)
		JPanel[] panPosters = new JPanel[5];
		JLabel[] lblIcons = new JLabel[panPosters.length];
		for(int i = 0 ; i < panPosters.length;i++) {
			panPosters[i] = new JPanel();
			MovieVO movie = mList.get(i);
			ImageIcon icon = new ImageIcon("img/" + movie.getPosterName() +".png");
			lblIcons[i] = new JLabel(icon);
			lblIcons[i].addMouseListener(new LblHandler(this, dao, lblIcons));
			panPosters[i].add(lblIcons[i]);
			panN.add(panPosters[i]);
			panPosters[i].setBackground(Color.orange);
		}
		add(panN, "North");
	}
	
	public void displayInfo() {
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 120));
		pan.setBackground(Color.WHITE);
		JButton btnPay = new JButton("����");
		btnPay.addActionListener(new BtnPayHandller(this));
		pan.add(lblInfo);
		pan.add(btnPay);
		lblInfo.setOpaque(true);
		lblInfo.setBackground(Color.WHITE);
		add(pan, "Center");
	}
	
	public void displayTicket() {
		lblTicket.setOpaque(true);
		lblTicket.setBackground(Color.ORANGE);
		lblTicket.setForeground(Color.WHITE);
		Font font = new Font("���� ���", Font.BOLD,  15);
		lblTicket.setFont(font);
		add(lblTicket, "South");
	}
	
	public static void main(String[] args) {
		MovieDAO dao = new MovieDAO();
		MovieReservationView view =  new MovieReservationView(dao);
	}

}
