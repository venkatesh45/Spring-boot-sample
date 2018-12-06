package hello.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import hello.DAO.StudentDAO;
import hello.io.Student;

@Service
public class StudentDAOImpl implements StudentDAO{

	@Override
	public void createStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> readStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student readStudent(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudent(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

}
