package emirim.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.thread.AnimationThread;
import emirim.view.AnimationView;

public class AnimationHandler implements ActionListener {
	private AnimationThread sst;
	private AnimationView ssv;

	public AnimationHandler(AnimationThread sst, AnimationView ssv) {
		super();
		this.sst = sst;
		this.ssv = ssv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eo = e.getSource();
		if(eo == ssv.getBtnFast()) {
			sst.setSpeedTime(100);
		}
		else if(eo == ssv.getBtnSlow()) {
			sst.setSpeedTime(400);
		}
		else if(eo == ssv.getBtnStop()) {
			sst.setStopFlog(true);
		}
		else if(eo == ssv.getBtnStart()) {
			sst.setStopFlog(false);
			synchronized (sst) {
				sst.notifyAll();
			}
		}
	}

}
