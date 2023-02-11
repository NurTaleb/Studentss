package com.example.demo.Repository;

import com.example.demo.Models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface StudentRepository extends MongoRepository <Student, String> {

        List<Student> findByName(String name);

        List<Student> findByEmailAndName (String email, String name);

        List<Student> findByNameOrEmail (String name, String email);

    }

