package com.spring.microservices.training.controller;

import com.spring.microservices.training.dao.StudentService;
import com.spring.microservices.training.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {

   private final StudentService studentService;

      @GetMapping("/student/{id}")
      public ResponseEntity<Student> findStudentbyID(@PathVariable Integer id){
          Optional<Student> student = studentService.getStudent(id);

          if (student.isPresent()) {
              return ResponseEntity.ok(studentService.getStudent(id).get());
          }else {
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          }

      }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity deleteStudent(@PathVariable Integer id) {
        Optional<Student> student = studentService.getStudent(id);
        if (student.isPresent()) {
            studentService.deleteStudent(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/students")
    public Student createStudentRecord(@RequestBody Student student){
          return studentService.save(student);
    }

    @PatchMapping("/student")
    public Student updateStudentRecords(@RequestBody Student student){
          return studentService.save(student);
    }


}
