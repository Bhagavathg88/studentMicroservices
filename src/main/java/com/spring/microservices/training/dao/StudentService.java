package com.spring.microservices.training.dao;

import com.spring.microservices.training.entity.Student;
import com.spring.microservices.training.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Optional<Student> getStudent(Integer studentID){

        return studentRepository.findById(studentID);

    }

    public void deleteStudent(Integer studentID){
         studentRepository.deleteById(studentID);
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }




}
