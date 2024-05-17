package com.niter.studentbackend.controller;

import com.niter.studentbackend.entity.Student;
import com.niter.studentbackend.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/students")
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }


    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getALLStudent();
    }


    @GetMapping("/{id}")
    public Optional<Student> getStudentId(@PathVariable int id) {
        return studentService.getStudentById(id);
    }


    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

}
