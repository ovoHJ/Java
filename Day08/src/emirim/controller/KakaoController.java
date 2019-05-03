package emirim.controller;

import emirim.audio.BGMusic;
import emirim.audio.ObstacleAudio;
import emirim.handler.KakaoHandler;
import emirim.thread.KakaoThread;
import emirim.view.KakaoView;

public class KakaoController {
	
	public static void main(String[] args) {
		
		KakaoView view = new KakaoView();
		KakaoHandler l = new KakaoHandler(view);
		view.addKeyListener(l);
		new BGMusic();
		KakaoThread kt = new KakaoThread(view);
		kt.start();
	}
	
}
