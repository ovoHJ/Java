package emirim.handler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import emirim.persistence.MovieDAO;
import emirim.view.MovieInfoView;
import emirim.view.MovieReservationView;

public class LblHandler extends MouseAdapter {
	private MovieReservationView mainView;
	private MovieDAO dao;
	private JLabel[] lblIcons;
	
	public LblHandler(MovieReservationView mainView, MovieDAO dao, JLabel[] lblIcons) {
		super();
		this.mainView = mainView;
		this.dao = dao;
		this.lblIcons = lblIcons;
	}

	@Override
	public void mouseClicked(MouseEvent e) { //°¨½ÃÀÚ ²¿ºÀ
		Object eo = e.getSource();
		int selecteIndex = 0;
		if(eo == lblIcons[0]) {
			selecteIndex = 0;
		}
		else if(eo == lblIcons[1]) {
			selecteIndex = 1;
		}
		else if(eo == lblIcons[2]) {
			selecteIndex = 2;
		}
		else if(eo == lblIcons[3]) {
			selecteIndex = 3;
		}
		else {
			selecteIndex = 4;
		}
		
		new MovieInfoView(mainView, dao, selecteIndex);
		
		//new MovieInfoView(dao);

	}
}
