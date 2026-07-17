package com.anikur.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);
		Student service = context.getBean(Student.class);
		service.setName("uranium");
		service.setRollNO(101);
		service.setMarks(200);
		service.print();
		service.computerCalling();
	}

}
