package com.anikur.SpringJDBCEx;

import com.anikur.SpringJDBCEx.model.Student;
import com.anikur.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setName("alimul");
		student.setRollNo(101);
		student.setMarks(1000);

		StudentService studentService = context.getBean(StudentService.class);

		studentService.addStudent(student);

		List<Student> students = studentService.getAllStudent();
		System.out.println(students);
	}

}
