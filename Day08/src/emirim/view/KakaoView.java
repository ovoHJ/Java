package emirim.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import emirim.constant.KakaoConstant;

public class KakaoView extends JFrame {

	private JLabel lbl, lblScore;
	private int[] obstacleX = {30, 600, 300};
	private int[] obstacleY = {160, 50, 500};
	private int[] treasureX = {350, 80, 500};
	private int[] treasureY = {200, 400, 300};
	private JLabel[] lblObstacle, lblTreasure;
	private int score;
	private JLabel lblBG = new JLabel(new ImageIcon("bg/back1.png"));
	
	public KakaoView() {
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		lblScore = new JLabel("점수 : " + score);
		lblScore.setBounds(KakaoConstant.JFRAME_WIDTH-KakaoConstant.SCORE_JLABEL_WIDTH-10, 30, KakaoConstant.SCORE_JLABEL_WIDTH, KakaoConstant.SCORE_JLABEL_HEIGHT);
		add(lblScore);
		lbl = new JLabel(new ImageIcon("cats/Do_F.png"));
		lbl.setBounds(0, 0, KakaoConstant.RYAN_JLABEL_WIDTH, KakaoConstant.RYAN_JLABEL_HEIGHT);
		add(lbl);
		lblObstacle = new JLabel[obstacleX.length];
		lblTreasure = new JLabel[treasureX.length];
//		장애물 JLabel
		for (int i = 0 ; i < lblObstacle.length ; i++) {
			lblObstacle[i] = new JLabel(new ImageIcon("cats/mice.png"));
			lblObstacle[i].setBounds(obstacleX[i], obstacleY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HEIGHT);
			add(lblObstacle[i]);
		}
		//보물 JLabel
		for (int i = 0 ; i < lblTreasure.length ; i++) {
			lblTreasure[i] = new JLabel(new ImageIcon("cats/bread.png"));
			lblTreasure[i].setBounds(treasureX[i], treasureY[i], KakaoConstant.OT_JLABEL_WIDTH, KakaoConstant.OT_JLABEL_HEIGHT);
			add(lblTreasure[i]);
		}
		
		lblBG.setBounds(0, 0, KakaoConstant.JFRAME_WIDTH, KakaoConstant.JFRAME_HEIGHT);
		add(lblBG);
		
		setFocusable(true);
		setTitle("Kakao");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 50, KakaoConstant.JFRAME_WIDTH, KakaoConstant.JFRAME_HEIGHT);
		setResizable(false); //프레임의 크기 변경이 안되게 설정
		setVisible(true);
		
	}
	public JLabel getLbl() {
		return lbl;
	}
	public JLabel getLblScore() {
		return lblScore;
	}
	public int[] getObstacleX() {
		return obstacleX;
	}
	public int[] getObstacleY() {
		return obstacleY;
	}
	public int[] getTreasureX() {
		return treasureX;
	}
	public int[] getTreasureY() {
		return treasureY;
	}
	public JLabel[] getLblObstacle() {
		return lblObstacle;
	}
	public JLabel[] getLblTreasure() {
		return lblTreasure;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public JLabel getLblBG() {
		return lblBG;
	}
		
}
