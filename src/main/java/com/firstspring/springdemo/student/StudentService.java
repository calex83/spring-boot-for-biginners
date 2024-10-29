package com.firstspring.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "John",
                        "Smith",
                        LocalDate.now(),
                        "john79@gmail.com",
                        46
                ),
                new Student(
                        "Sam",
                        "Doe",
                        LocalDate.now(),
                        "sam89@gmail.com",
                        36
                )
        );
    }
}
