package com.niter.studentbackend.service;

import com.niter.studentbackend.entity.Student;
import com.niter.studentbackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public List<Student> getALLStudent() {
        return studentRepository.findAll();
    }

    public Student updateStudent(int id, Student student) {
        Student studentToUpdate = studentRepository.findById(id).orElseThrow();
        studentToUpdate.setStudentId(student.getStudentId());
        studentToUpdate.setName(student.getName());
        return studentRepository.save(studentToUpdate);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
