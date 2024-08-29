package com.spring.microservices.training.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity(name = "STUDENT")
@Data
public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", course='" + course + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    public Integer studentId;

    @JsonProperty("First Name")
    public String firstName;

    @JsonProperty("Last Name")
    public String lastName;

    @JsonProperty("DOB")
    @JsonFormat(pattern = "MM/dd/yyyy")
    public LocalDate dateOfBirth;

    @JsonProperty("Course")
    public String course;

    protected Student(){

    }

    public Student(Integer studentId, String firstName,String lastName, LocalDate dateOfBirth,String course){
        this.studentId=studentId;
        this.course = course;
        this.lastName=lastName;
        this.firstName=firstName;
        this.dateOfBirth = dateOfBirth;
    }

}
