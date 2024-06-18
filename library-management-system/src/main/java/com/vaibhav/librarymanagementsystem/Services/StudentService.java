package com.vaibhav.librarymanagementsystem.Services;

import com.vaibhav.librarymanagementsystem.Models.Student;
import com.vaibhav.librarymanagementsystem.StudentRepositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student){

        studentRepository.save(student);
        return "Student has been saved to the DB";
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }



}