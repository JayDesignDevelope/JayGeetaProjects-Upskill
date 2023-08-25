package com.example.sms.service.impl;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentrepository;

    public StudentServiceImpl(StudentRepository studentrepository) {
        super();
        this.studentrepository = studentrepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentrepository.findAll();
    };
}

