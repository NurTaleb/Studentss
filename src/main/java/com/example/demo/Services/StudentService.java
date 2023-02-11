package com.example.demo.Services;

import com.example.demo.Models.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent (Student student) {
        return studentRepository.save(student);
    }
    public Student getstudentbyId(String id) {
        return studentRepository.findById(id).get();
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student has been deleted";
    }

    //specialare

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> studentsByEmailAndName (String name, String email) {
        return studentRepository.findByEmailAndName(email, name);
    }

    public List<Student> studentsByNameOrEMail (String name, String email) {
        return studentRepository.findByNameOrEmail(name, email);
    }
}
