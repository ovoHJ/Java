package emirim.thread;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import emirim.view.AnimationView;

public class AnimationThread extends Thread {

	private AnimationView av;
	private JLabel lblNeo;
	private boolean rightFlag = true;
	private int speedTime = 200;
	private boolean stopFlag = false;
	
	public AnimationThread(AnimationView av) {
		super();
		this.av = av;
		this.lblNeo = av.getLblNeo();
	}
	
	public void setSpeedTime(int speedTime) {
		this.speedTime = speedTime;
	}

	public void setStopFlog(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}

	public void run() {
		String filename = null;
		ImageIcon icon = null;
		while(true) {
			synchronized (this) {

				if(stopFlag) 
				{ //stopFlag==true¸é 
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					if(lblNeo.getX() == 520)
						rightFlag = false;
					else if(lblNeo.getX() == 0)
						rightFlag = true;
					
					if(rightFlag) {
						lblNeo.setLocation(lblNeo.getX()+10, lblNeo.getY());
						filename = "imgs/neo1.gif";
						icon = new ImageIcon(filename);
						lblNeo.setIcon(icon);
					} else {
						lblNeo.setLocation(lblNeo.getX()-10, lblNeo.getY());
						filename = "imgs/neo2.gif";
						icon = new ImageIcon(filename);
						lblNeo.setIcon(icon);
					}
					try {
						sleep(speedTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}//end catch
				}//end else
			}//end synchronized
		}//end while
	}//end run

}
