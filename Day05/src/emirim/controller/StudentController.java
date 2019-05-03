package emirim.controller;

import java.util.Scanner;

import emirim.domain.StudentVO;
import emirim.persistence.StudentDAO;
import emirim.view.ScoreView;

public class StudentController {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		ScoreView view = new ScoreView();
		while(true) {
			view.inputStudentInfo(dao, s1, s2);
			System.out.print(" >> 계속 정보를 입력하시겠습니까? (Y/N) : ");
			String s = s2.nextLine();
			if(s.contentEquals("n") || s.contentEquals("N")) {
				break;
			}
		}
		view.displayResult(dao);
		
		s1.close();
		s2.close();
		
	}
}