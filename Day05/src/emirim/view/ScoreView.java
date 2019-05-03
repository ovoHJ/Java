package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.StudentVO;
import emirim.persistence.StudentDAO;

public class ScoreView {

	public void displayResult(StudentDAO dao) {
		ArrayList<StudentVO> vo = dao.getStudentList();
		System.out.println("\n┌──────────────────────────── 1학년 3반 성적처리 ────────────────────────────┐\n");
		System.out.printf("      학번\t성명\t국어\t영어\t수학\t가정\t국사\t총점\t  평균\n");
		for (StudentVO studentVO : vo) {
			System.out.printf(" %5d\t%s\t%2d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", studentVO.getClassNumber(), studentVO.getName(), studentVO.getKor(), studentVO.getEng(), studentVO.getMath(), studentVO.getHome(), studentVO.getHitory(), studentVO.getSum(), studentVO.getAverage());
		}
		System.out.println("\n└──────────────────────────────────────────────────────────────────────┘");
	}
	
	public void inputStudentInfo (StudentDAO dao, Scanner s1, Scanner s2) {
		System.out.println(" >> 학생 정보와 성적을 입력해 주세요.");
		System.out.print(" >> 학번  :  ");
		int stuId = s1.nextInt();
		System.out.print(" >> 성명  :  ");
		String name = s2.nextLine();
		System.out.print(" >> 국어  :  ");
		int kor = s1.nextInt();
		System.out.print(" >> 영어  :  ");
		int eng = s1.nextInt();
		System.out.print(" >> 수학  :  ");
		int math = s1.nextInt();
		System.out.print(" >> 가정  :  ");
		int home = s1.nextInt();
		System.out.print(" >> 국사  :  ");
		int history = s1.nextInt();
		dao.addStudent(new StudentVO(stuId, name, kor, eng, math, home, history));
	}
	
}
