package com.college.liberaryCard.Controllers;

import com.college.liberaryCard.Models.Student;
import com.college.liberaryCard.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        String reponse = studentService.createStudent(student);
        return new ResponseEntity<>(reponse, HttpStatus.CREATED);
    }
}
