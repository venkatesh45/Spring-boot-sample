package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hello.Impl.StudentDAOImpl;

@Controller
public class StudentAPI {

	@Autowired
	StudentDAOImpl studentDAOImpl;
	
}
