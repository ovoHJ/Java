package emirim.handler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.domain.MovieVO;
import emirim.view.MovieInfoView;
import emirim.view.MovieReservationView;

public class BtnSelectHandler implements ActionListener {
	private MovieReservationView mainView;
	private MovieVO movie;
	private MovieInfoView info;

	public BtnSelectHandler(MovieReservationView mainView, MovieVO movie, MovieInfoView info) {
		super();
		this.mainView = mainView;
		this.movie = movie;
		this.info = info;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eo = e.getSource();
		if(eo == info.getBtnSelsect()) {
			String text = "<html>"
					+ " 영화제목 : <font size='5'>" + movie.getMovieTitle() + "</font><br>"
					+ " 장르 : " + movie.getGenre() + "<br>"
					+ " 제한연령 : " + movie.getOverAge() + "<br>"
					+ " 가격 : " + movie.getPrice() + "<br>"
					+ "</html>";
			mainView.lblInfo.setBackground(Color.WHITE);
			mainView.lblInfo.setForeground(Color.ORANGE);
			mainView.lblInfo.setText(text);
			
		}else {
			info.setVisible(false);
		}
	}

}
