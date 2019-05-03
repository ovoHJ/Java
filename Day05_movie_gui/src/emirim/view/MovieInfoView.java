package emirim.view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnSelectHandler;
import emirim.persistence.MovieDAO;

public class MovieInfoView extends JFrame {
	private MovieDAO dao;
	private int selectedIndex;
	JButton btnSelect = new JButton("선택");
	JButton btnCancel = new JButton("취소");
	private MovieReservationView mainView;
	
	public MovieInfoView(MovieReservationView mainView, MovieDAO dao, int selectedIndex) {
		this.dao = dao;
		this.selectedIndex = selectedIndex;
		this.mainView = mainView;
		setLayout(new GridLayout(1, 3));
		displayInfo();
		setTitle("선택한 영화 정보");
		setBounds(900, 70, 600, 300);
		setVisible(true);
	}
	public JButton getBtnSelsect() {
		return btnSelect;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	
	
	
	public void displayInfo() {
		ArrayList<MovieVO> mList = dao.getMovieList();
		MovieVO movie = mList.get(selectedIndex);
		
		ImageIcon image = new ImageIcon("img/" + movie.getPosterName() +".png");
		String infoStr = "<html>"
						+ " 영화제목 : <font size='5' color='red'>" + movie.getMovieTitle() + "</font><br>"
						+ " 장르 : " + movie.getGenre() + "<br>"
						+ " 제한연령 : " + movie.getOverAge() + "<br>"
						+ " 가격 : " + movie.getPrice() + "<br>"
						+ "</html>";
		JLabel lblPoster = new JLabel(image);
		JLabel lblInfo = new JLabel(infoStr);
		JPanel pan = new JPanel();
		btnSelect.addActionListener(new BtnSelectHandler(mainView, movie, this));
		btnCancel.addActionListener(new BtnSelectHandler(mainView, movie, this));
		add(lblPoster);
		add(lblInfo);
		pan.add(btnSelect);
		pan.add(btnCancel);
		add(pan);
	}
	
}
