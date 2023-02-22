package com.college.liberaryCard.Controllers;

import com.college.liberaryCard.Models.Student;
import com.college.liberaryCard.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        String reponse = studentService.createStudent(student);
        return new ResponseEntity<>(reponse, HttpStatus.CREATED);
    }

    @GetMapping("/add-user")
    public String getNameByEmail(@RequestParam("email") String email){

    }
}
