import javax.swing.*;

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
		else if(panelName.equals("addRef")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(addRef);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("addFre")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(addFre);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("showRef")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(showFre);
			// 새로고침(?)
			revalidate();
			repaint();
		}
		else if(panelName.equals("showFre")) {
			// 연결된 판넬 알아내서 삭제
			getContentPane().removeAll();
			// choice를 연결
			getContentPane().add(showRef);
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
