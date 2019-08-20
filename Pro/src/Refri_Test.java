/*
 * 2302 강혜정
 * 이 프로젝트는 우리 집 냉장고에 어떤 재료와 음식이 있는지 확인하고, 장 볼 때 이미 사놓은 재료를 사는 것을 방지해주는 프로그램을 구현하는 것입니다.
 * 또한 구매한 재료들을 추가할 수 있습니다.
 * 실행 방법은 어느 파일에서든 실행시키면 됩니다.
 */

import javax.swing.JFrame;

//이 class는 다른 파일들을 제어하는 class입니다
public class Refri_Test extends JFrame {
	
	public Refri_Menu menu = null;
	public Refri_Choice choice = null;
	public addRef addRef = null;
	public addFre addFre = null;
	public showRef showRef = null;	
	public showFre showFre = null;
	
	public void change(String panelName) {
		// MyActionListener
		if(panelName.equals("panel01")) {
			getContentPane().removeAll();
			getContentPane().add(menu);
			revalidate();
			repaint();
		}
		
		else if(panelName.equals("panel02")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(choice);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("1")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(showFre);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("2")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(showRef);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("3")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(addFre);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("4")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(addRef);
			// 새로고침(?)
			revalidate();
			repaint();
		}
	}

	public static void main(String[] args) {
		
		// 객체 생성
		Refri_Test test = new Refri_Test();
		
		test.setTitle("우리집 냉장고에는?");
		test.menu = new Refri_Menu(test);
		test.choice = new Refri_Choice(test);
		test.addRef = new addRef(test);
		test.addFre = new addFre(test);
		test.showRef = new showRef(test);
		test.showFre = new showFre(test);
		
		// JFrame에 추가
		test.add(test.menu);
		test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		test.setSize(1080, 720);
		test.setVisible(true);
		
	}
}
