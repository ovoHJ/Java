package emirim.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.controller.SlideShowController;
import emirim.thread.SlideShowThread;
import emirim.view.SlideShowView;

public class BtnSlideHandler implements ActionListener {
	
	private SlideShowView ssv;
	private SlideShowThread sst;

	public BtnSlideHandler(SlideShowView ssv, SlideShowThread sst) {
		super();
		this.ssv = ssv;
		this.sst = sst;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eo = e.getSource();
		if(eo == ssv.getBtnFast()) {
			sst.setSpeedTime(100);
		}
		else if(eo == ssv.getBtnMiddle()) {
			sst.setSpeedTime(600);
		}
		else {
			sst.setSpeedTime(1200);
			
		}
	}

}
