package emirim.handler;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import emirim.audio.ObstacleAudio;
import emirim.audio.TreasureAudio;
import emirim.constant.KakaoConstant;
import emirim.view.KakaoView;

public class KakaoHandler extends KeyAdapter {
	
	private JLabel lbl;
	private KakaoView view;
	private int[] obstacleX, obstacleY, treasureX, treasureY;
	private int[] obstartX, obendX, obstartY, obendY;
	private int[] trstartX, trendX, trstarty, trendY;
	private JLabel lblScore;
	private boolean prev_status_hit = false;	

	public KakaoHandler(KakaoView view) {
		super();
		this.view = view;
		this.lbl = view.getLbl(); //캐릭터 라벨
		this.lblScore = view.getLblScore();  //점수 라벨
		this.obstacleX = view.getObstacleX(); //장애물 X좌표를 저장한 배열
		this.obstacleY = view.getObstacleY(); //장애물 Y좌표르르 저장된 배열
		this.treasureX = view.getTreasureX();  //보물 X좌표를 저장된 배열
		this.treasureY = view.getTreasureY();  //보물 Y좌표를 저장된 배열
		this.obstartX = new int[obstacleX.length];  //장애물이 시작되는x좌표 3개를 저장하는 배열
		this.obendX = new int[obstacleX.length];  //장애물이 끝나는 X좌표 3개를 저장하는 배열
		this.obstartY = new int[obstacleX.length];  //장애물이 시작되는Y좌표 3개를 저장하는 배열
		this.obendY = new int[obstacleX.length];  //장애물이 끝나는 Y좌표 3개를 저장하는 배열
		
		for(int i = 0 ; i < obendX.length ; i++) {
			obstartX[i] = obstacleX[i]-KakaoConstant.RYAN_JLABEL_WIDTH;
			obendX[i] = obstacleX[i] +KakaoConstant.OT_JLABEL_WIDTH;
			obstartY[i] = obstacleY[i]-KakaoConstant.RYAN_JLABEL_HEIGHT;
			obendY[i] = obstacleY[i] + KakaoConstant.OT_JLABEL_HEIGHT;
		}
//		캐릭터 보물이 부딪히는 지점의 시작점 끝점의 좌표들
		this.trstartX = new int[treasureX.length];
		this.trendX = new int[treasureX.length];
		this.trstarty = new int[treasureX.length];
		this.trendY = new int[treasureX.length];
		for(int i = 0 ; i < trendX.length ; i++) {
			trstartX[i] = treasureX[i]-KakaoConstant.RYAN_JLABEL_WIDTH;
			trendX[i] = treasureX[i]+KakaoConstant.OT_JLABEL_WIDTH;
			trstarty[i] = treasureY[i]-KakaoConstant.RYAN_JLABEL_HEIGHT;
			trendY[i] = treasureY[i]+KakaoConstant.OT_JLABEL_HEIGHT;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int x = lbl.getX(); //방향키 중에 하나가 눌러졌을 때 캐릭터의 X좌표
		int y = lbl.getY();
		boolean object_hit = false;
		
		if(view.getScore()>=100) {
			int ok = JOptionPane.showConfirmDialog(view, "2단계로 넘어가시겠습니까?");
			if(ok == 0) {
				view.setScore(0);
				view.setVisible(false);
				view.dispose();
				new KakaoView();
			}
		}
	
//		장애물의 위치를 확인해서 점수감소
		for (int i = 0 ; i < obstacleX.length ; i++) {
			if(x>obstartX[i] && x<obendX[i])
				if(y>obstartY[i] && y<obendY[i]) {
					if (!prev_status_hit) {
						view.setScore(view.getScore()-10);
						lblScore.setText("점수 : " + view.getScore());
						new ObstacleAudio();
					}
					object_hit = true;
				}
		}
		
//		보물의 위치를 확인해서 점수 증가
		for(int i = 0 ; i < treasureX.length ; i++) {
			if(x>trstartX[i] && x<trendX[i])
				if(y>trstarty[i] && y<trendY[i]) {
					if (!prev_status_hit) {
						view.setScore(view.getScore()+10);
						lblScore.setText("점수 : " + view.getScore());
						new TreasureAudio();
					}
					object_hit = true;	
				}
		}
		prev_status_hit = object_hit;
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			if(x==KakaoConstant.JFRAME_WIDTH-KakaoConstant.RYAN_JLABEL_WIDTH) {
				lbl.setLocation(x, y);
			}else {
				lbl.setLocation(x+5, y);
			}
			lbl.setIcon(new ImageIcon("cats/Do_R.png"));
			break;
		case KeyEvent.VK_LEFT:
			if(x==0) {
				lbl.setLocation(x, y);
			} else {
				lbl.setLocation(x-5, y);
			}
			lbl.setIcon(new ImageIcon("cats/Do_L.png"));
			break;
		case KeyEvent.VK_UP:
			if(y==0) {
				lbl.setLocation(x, y);
			}else {
				lbl.setLocation(x, y-5);
			}
			lbl.setIcon(new ImageIcon("cats/Do_B.png"));
			break;
		case KeyEvent.VK_DOWN:
			if(y==KakaoConstant.JFRAME_HEIGHT-KakaoConstant.RYAN_JLABEL_HEIGHT-30) {
				lbl.setLocation(x, y);
			}else {
				lbl.setLocation(x, y+5);
			}
			lbl.setIcon(new ImageIcon("cats/Do_F.png"));
			break;
		}
		
	}
	
}
