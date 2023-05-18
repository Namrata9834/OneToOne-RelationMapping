package com.springBootRelations.RelationMapping.controller;

import com.springBootRelations.RelationMapping.entity.Student;
import com.springBootRelations.RelationMapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@Controller
@RequestMapping("/candidate")
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
     @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){
        return studentRepository.findById(studentId).orElseThrow(()->
                                                        new NoSuchElementException("student not found"));
    }
}
