package emirim.controller;

import emirim.handler.AnimationHandler;
import emirim.thread.AnimationThread;
import emirim.view.AnimationView;

public class AnimationController {

	public static void main(String[] args) {
		
		AnimationView av = new AnimationView();
		AnimationThread at = new AnimationThread(av);
		AnimationHandler ah = new AnimationHandler(at, av);
		av.getBtnFast().addActionListener(ah);
		av.getBtnSlow().addActionListener(ah);
		av.getBtnStart().addActionListener(ah);
		av.getBtnStop().addActionListener(ah);
		at.start();

	}

}
