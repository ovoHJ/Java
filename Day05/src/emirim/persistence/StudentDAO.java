package emirim.persistence;

import java.util.ArrayList;

import emirim.domain.StudentVO;

public class StudentDAO {
	
	ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
	
	public void addStudent(StudentVO student) {
		studentList.add(student);
	}

	public ArrayList<StudentVO> getStudentList() {
		return studentList;
	}
	
}