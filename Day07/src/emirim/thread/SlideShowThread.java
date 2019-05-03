package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import emirim.view.SlideShowView;

public class SlideShowThread extends Thread {
	private SlideShowView ssv;
	private JLabel lblImg;
	private int speedTime = 400;
	
	public SlideShowThread(SlideShowView ssv) {
		super();
		this.ssv = ssv;
		lblImg = ssv.getLblImg();
	}

	public void setSpeedTime(int speedTime) {
		this.speedTime = speedTime;
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			i++;
			if(i==40)
				i=1;
			String filename = "imgs/bts_" + i + ".jpg";
			ImageIcon image = new ImageIcon(filename);
			lblImg.setIcon(image);
			try {
				sleep(speedTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
