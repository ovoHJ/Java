package emirim.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.view.MovieReservationView;

public class BtnPayHandller implements ActionListener {
	private MovieReservationView mainView;
	
	public BtnPayHandller(MovieReservationView mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = mainView.lblInfo.getText();
		mainView.lblTicket.setText(text);
	}
}
