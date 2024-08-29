package com.spring.microservices.training.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentFee {

    public Integer studentFeeId;
    public Integer courseId;
    public Integer studentId;
    public Double amountDue;
    public Double amountPaid;

    @JsonFormat(pattern = "MM/dd/yyyy")
    public LocalDate paidDate;

    protected StudentFee(){

    }

    public StudentFee(Integer studentFeeId, Integer courseId, Double amountDue, Double amountPaid, LocalDate paidDate){
        this.studentFeeId=studentFeeId;
        this.courseId = courseId;
        this.amountDue=amountDue;
        this.amountPaid=amountPaid;
        this.paidDate = paidDate;
    }

}
