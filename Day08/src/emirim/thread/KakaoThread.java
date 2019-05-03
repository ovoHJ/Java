package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import emirim.view.KakaoView;

public class KakaoThread extends Thread {

	private KakaoView view;
	private JLabel lblBG;
	
	public KakaoThread(KakaoView view) {
		this.view = view;
		lblBG = view.getLblBG();
	}

	@Override
	public void run() {
		int i = 1;
		while(true) {
			i++;
			if(i == 4)
				i = 1;
			try {
				sleep(1000);
				ImageIcon icon = new ImageIcon("bg/back" + i +".png");
				lblBG.setIcon(icon);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
