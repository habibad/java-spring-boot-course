package com.anikur.SpringJDBCEx.service;

import com.anikur.SpringJDBCEx.model.Student;
import com.anikur.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student){
        repo.save(student);
    }

    public List<Student> getAllStudent() {
        return repo.findAll();
    }


}
