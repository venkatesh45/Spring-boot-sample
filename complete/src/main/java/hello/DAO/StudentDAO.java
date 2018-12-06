package hello.DAO;

import hello.io.Student;
import java.util.*;

public interface StudentDAO {
	public void createStudent(Student s);
	public List<Student> readStudent();
	public int updateStudent(Student s);
	public int deleteStudent(Student s);
	Student readStudent(int sid);
}
