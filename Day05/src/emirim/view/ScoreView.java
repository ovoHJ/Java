package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.StudentVO;
import emirim.persistence.StudentDAO;

public class ScoreView {

	public void displayResult(StudentDAO dao) {
		ArrayList<StudentVO> vo = dao.getStudentList();
		System.out.println("\n���������������������������������������������������������� 1�г� 3�� ����ó�� ����������������������������������������������������������\n");
		System.out.printf("      �й�\t����\t����\t����\t����\t����\t����\t����\t  ���\n");
		for (StudentVO studentVO : vo) {
			System.out.printf(" %5d\t%s\t%2d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", studentVO.getClassNumber(), studentVO.getName(), studentVO.getKor(), studentVO.getEng(), studentVO.getMath(), studentVO.getHome(), studentVO.getHitory(), studentVO.getSum(), studentVO.getAverage());
		}
		System.out.println("\n������������������������������������������������������������������������������������������������������������������������������������������������");
	}
	
	public void inputStudentInfo (StudentDAO dao, Scanner s1, Scanner s2) {
		System.out.println(" >> �л� ������ ������ �Է��� �ּ���.");
		System.out.print(" >> �й�  :  ");
		int stuId = s1.nextInt();
		System.out.print(" >> ����  :  ");
		String name = s2.nextLine();
		System.out.print(" >> ����  :  ");
		int kor = s1.nextInt();
		System.out.print(" >> ����  :  ");
		int eng = s1.nextInt();
		System.out.print(" >> ����  :  ");
		int math = s1.nextInt();
		System.out.print(" >> ����  :  ");
		int home = s1.nextInt();
		System.out.print(" >> ����  :  ");
		int history = s1.nextInt();
		dao.addStudent(new StudentVO(stuId, name, kor, eng, math, home, history));
	}
	
}
