package com.springbootcrudexample.controller;

import com.springbootcrudexample.entity.Student;
import com.springbootcrudexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent1(@RequestBody Student student) {
        Student createResponse = studentService.save(student);
        return createResponse;
    }


    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student getReponse = studentService.get(id);
        return getReponse;
    }

    @GetMapping("/getallstudents")
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getAll();
        return students;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        Student updateResponse = studentService.update(student);
        return updateResponse;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
        return "Record deleted succesfully";
    }

}
