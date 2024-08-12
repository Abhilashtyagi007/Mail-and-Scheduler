package com.email.controller;


import com.email.dto.StudentDto;
import com.email.entities.Laptop;
import com.email.entities.Student;
import com.email.model.PropertyConfigModel;
import com.email.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private PropertyConfigModel configModel;

    @PostMapping("/create")
    public ResponseEntity<Student> create(@RequestBody StudentDto dto){
            Student student = dto.getStudent();
            List<Laptop> laptop = dto.getLaptopList();
            studentService.createStudent(student,laptop);
            return new ResponseEntity<>(student, HttpStatus.OK);

    }

    @GetMapping("/custom")
    public ResponseEntity<PropertyConfigModel> getProp(){
        return new ResponseEntity<>(configModel,HttpStatus.OK);
    }
}
