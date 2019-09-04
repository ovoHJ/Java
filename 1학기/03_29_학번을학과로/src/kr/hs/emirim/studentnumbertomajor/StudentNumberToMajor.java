package kr.hs.emirim.studentnumbertomajor;

import java.util.Scanner;

public class StudentNumberToMajor {
	private static String[] class3 = {"인터랙티브미디어과", "인터랙티브미디어과", "뉴미디어디자인과", "뉴미디어디자인과", "뉴미디어솔루션과", "뉴미디어솔루션과"};
	private static String[] class2 = {"뉴미디어소프트웨어과", "뉴미디어소프트웨어과", "뉴미디어웹솔루션과", "뉴미디어솔루션과", "뉴미디어디자인과", "뉴미디어디자인과"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String studentNumber;
		System.out.print("학번 입력 : ");
		studentNumber = sc.next();
		
		if(studentNumber.substring(0,1).equals("3")) {
			String classroomStr = studentNumber.substring(1, 2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(class3[classroom]);
			
//			if(studentNumber.substring(1,2).equals("1") || studentNumber.substring(1,2).equals("2")) {
//				System.out.println("인터랙티브미디어과");
//			}
//			else if(studentNumber.substring(1,2).equals("3") || studentNumber.substring(1,2).equals("4")) {
//				System.out.println("뉴미디어디자인과");
//			}
//			else if(studentNumber.substring(1,2).equals("5") || studentNumber.substring(1,2).equals("6")) {
//				System.out.println("뉴미디어솔루션과");
//			}
		}
		else if(studentNumber.substring(0,1).equals("2") || studentNumber.substring(0,1).equals("1")) {
			String classroomStr = studentNumber.substring(1, 2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(class2[classroom]);
			
//			if(studentNumber.substring(1,2).equals("1") || studentNumber.substring(1,2).equals("2")) {
//				System.out.println("뉴미디어소프트웨어과");
//			}
//			else if(studentNumber.substring(1,2).equals("3") || studentNumber.substring(1,2).equals("4")) {
//				System.out.println("뉴미디어웹솔루션과");
//			}
//			else if(studentNumber.substring(1,2).equals("5") || studentNumber.substring(1,2).equals("6")) {
//				System.out.println("뉴미디어디자인과");
//			}
		}
		else
			System.out.println("학번을 잘못 입력했습니다");
	}

}
